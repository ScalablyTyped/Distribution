package typings.googleapis.buildSrcApisPubsubV1Mod.pubsub_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/pubsub/v1", "pubsub_v1.Resource$Projects$Topics")
@js.native
class ResourceDollarProjectsDollarTopics protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  var snapshots: ResourceDollarProjectsDollarTopicsDollarSnapshots = js.native
  var subscriptions: ResourceDollarProjectsDollarTopicsDollarSubscriptions = js.native
  /**
    * pubsub.projects.topics.create
    * @desc Creates the given topic with the given name. See the <a
    * href="https://cloud.google.com/pubsub/docs/admin#resource_names">
    * resource name rules</a>.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the topic. It must have the format
    *     // `"projects/{project}/topics/{topic}"`. `{topic}` must start with a
    * letter,
    *     // and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes
    * (`-`),
    *     // underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or
    * percent
    *     // signs (`%`). It must be between 3 and 255 characters in length,
    * and it
    *     // must not start with `"goog"`.
    *     name: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. All existing
    * properties
    *       // will be replaced.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.create(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.create
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    * @param {().Topic} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def create(): GaxiosPromise[Schema$Topic] = js.native
  def create(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarCreate): GaxiosPromise[Schema$Topic] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarCreate,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarCreate,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def create(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarCreate, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def create(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarCreate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.delete
    * @desc Deletes the topic with the given name. Returns `NOT_FOUND` if the
    * topic does not exist. After a topic is deleted, a new topic may be
    * created with the same name; this is an entirely new topic with none of
    * the old configuration or subscriptions. Existing subscriptions to this
    * topic are not deleted, but their `topic` field is set to
    * `_deleted-topic_`.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the topic to delete.
    *     // Format is `projects/{project}/topics/{topic}`.
    *     topic: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.delete(request, function(err) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic Name of the topic to delete. Format is `projects/{project}/topics/{topic}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Schema$Empty] = js.native
  def delete(callback: BodyResponseCallback[Schema$Empty]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarDelete): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarDelete,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarDelete,
    options: BodyResponseCallback[Schema$Empty],
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarDelete, options: MethodOptions): GaxiosPromise[Schema$Empty] = js.native
  def delete(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Empty]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.get
    * @desc Gets the configuration of a topic.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the topic to get.
    *     // Format is `projects/{project}/topics/{topic}`.
    *     topic: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.get(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic The name of the topic to get. Format is `projects/{project}/topics/{topic}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Topic] = js.native
  def get(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGet): GaxiosPromise[Schema$Topic] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGet,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGet,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def get(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.getIamPolicy
    * @desc Gets the access control policy for a resource. Returns an empty
    * policy if the resource exists and does not have a policy set.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.getIamPolicy(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.list
    * @desc Lists matching topics.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The name of the cloud project that topics belong to.
    *     // Format is `projects/{project}`.
    *     project: 'projects/my-project',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   var handlePage = function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     var topicsPage = response['topics'];
    *     if (!topicsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < topicsPage.length; i++) {
    *       // TODO: Change code below to process each resource in
    * `topicsPage`: console.log(JSON.stringify(topicsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       pubsub.projects.topics.list(request, handlePage);
    *     }
    *   };
    *
    *   pubsub.projects.topics.list(request, handlePage);
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {integer=} params.pageSize Maximum number of topics to return.
    * @param {string=} params.pageToken The value returned by the last `ListTopicsResponse`; indicates that this is a continuation of a prior `ListTopics` call, and that the system should return the next page of data.
    * @param {string} params.project The name of the project in which to list topics. Format is `projects/{project-id}`.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(callback: BodyResponseCallback[Schema$ListTopicsResponse]): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarList): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarList,
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarList,
    options: BodyResponseCallback[Schema$ListTopicsResponse],
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarList, options: MethodOptions): GaxiosPromise[Schema$ListTopicsResponse] = js.native
  def list(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$ListTopicsResponse]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.patch
    * @desc Updates an existing topic. Note that certain properties of a topic
    * are not modifiable.
    * @alias pubsub.projects.topics.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.name The name of the topic. It must have the format `"projects/{project}/topics/{topic}"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `"goog"`.
    * @param {().UpdateTopicRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Topic] = js.native
  def patch(callback: BodyResponseCallback[Schema$Topic]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPatch): GaxiosPromise[Schema$Topic] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPatch,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPatch,
    options: BodyResponseCallback[Schema$Topic],
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Topic] = js.native
  def patch(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Topic]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.publish
    * @desc Adds one or more messages to the topic. Returns `NOT_FOUND` if the
    * topic does not exist.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // The messages in the request will be published on this topic.
    *     // Format is `projects/{project}/topics/{topic}`.
    *     topic: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.publish(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.publish
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.topic The messages in the request will be published on this topic. Format is `projects/{project}/topics/{topic}`.
    * @param {().PublishRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def publish(): GaxiosPromise[Schema$PublishResponse] = js.native
  def publish(callback: BodyResponseCallback[Schema$PublishResponse]): Unit = js.native
  def publish(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPublish): GaxiosPromise[Schema$PublishResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPublish,
    callback: BodyResponseCallback[Schema$PublishResponse]
  ): Unit = js.native
  def publish(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPublish,
    options: BodyResponseCallback[Schema$PublishResponse],
    callback: BodyResponseCallback[Schema$PublishResponse]
  ): Unit = js.native
  def publish(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPublish, options: MethodOptions): GaxiosPromise[Schema$PublishResponse] = js.native
  def publish(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarPublish,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$PublishResponse]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.setIamPolicy
    * @desc Sets the access control policy on the specified resource. Replaces
    * any existing policy.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy is being specified.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.setIamPolicy(request, function(err, response) {
    *     if (err) {
    *       console.error(err);
    *       return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field.
    * @param {().SetIamPolicyRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * pubsub.projects.topics.testIamPermissions
    * @desc Returns permissions that a caller has on the specified resource. If
    * the resource does not exist, this will return an empty set of
    * permissions, not a NOT_FOUND error.  Note: This operation is designed to
    * be used for building permission-aware UIs and command-line tools, not for
    * authorization checking. This operation may "fail open" without warning.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Google Cloud Pub/Sub API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/pubsub
    * // 2. This sample uses Application Default Credentials for
    * authentication.
    * //    If not already done, install the gcloud CLI from
    * //    https://cloud.google.com/sdk and run
    * //    `gcloud beta auth application-default login`.
    * //    For more information, see
    * //
    * https://developers.google.com/identity/protocols/application-default-credentials
    * // 3. Install the Node.js client library by running
    * //    `npm install googleapis --save`
    *
    * var google = require('googleapis');
    * var pubsub = google.pubsub('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // REQUIRED: The resource for which the policy detail is being
    * requested.
    *     // See the operation documentation for the appropriate value for this
    * field. resource_: 'projects/my-project/topics/my-topic',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   pubsub.projects.topics.testIamPermissions(request, function(err,
    * response) { if (err) { console.error(err); return;
    *     }
    *
    *     // TODO: Change code below to process the `response` object:
    *     console.log(JSON.stringify(response, null, 2));
    *   });
    * });
    *
    * function authorize(callback) {
    *   google.auth.getApplicationDefault(function(err, authClient) {
    *     if (err) {
    *       console.error('authentication failed: ', err);
    *       return;
    *     }
    *     if (authClient.createScopedRequired &&
    * authClient.createScopedRequired()) { var scopes =
    * ['https://www.googleapis.com/auth/cloud-platform']; authClient =
    * authClient.createScoped(scopes);
    *     }
    *     callback(authClient);
    *   });
    * }
    * @alias pubsub.projects.topics.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.resource_ REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field.
    * @param {().TestIamPermissionsRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarProjectsDollarTopicsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarTestiampermissions,
    options: MethodOptions
  ): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarProjectsDollarTopicsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
}

