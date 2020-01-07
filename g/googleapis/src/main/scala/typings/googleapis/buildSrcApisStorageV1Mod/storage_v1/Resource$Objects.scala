package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.gaxios.buildSrcCommonMod.GaxiosPromise
import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.BodyResponseCallback
import typings.googleapisDashCommon.buildSrcApiMod.MethodOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("googleapis/build/src/apis/storage/v1", "storage_v1.Resource$Objects")
@js.native
class Resource$Objects protected () extends js.Object {
  def this(context: APIRequestContext) = this()
  var context: APIRequestContext = js.native
  /**
    * storage.objects.compose
    * @desc Concatenates a list of existing objects into a new object in the
    * same bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to store the new object.
    *     destinationBucket: 'my-destination-bucket',  // TODO: Update
    * placeholder value.
    *
    *     // Name of the new object. For information about how to URL encode
    * object names to be path safe, see
    *     // Encoding URI Path Parts.
    *     destinationObject: 'my-destination-object',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.compose(request, function(err, response) {
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
    * @alias storage.objects.compose
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket containing the source objects. The destination object is stored in this bucket.
    * @param {string} params.destinationObject Name of the new object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.destinationPredefinedAcl Apply a predefined set of access controls to the destination object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.kmsKeyName Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().ComposeRequest} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def compose(): GaxiosPromise[Schema$Object] = js.native
  def compose(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def compose(params: ParamsDollarResourceDollarObjectsDollarCompose): GaxiosPromise[Schema$Object] = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def compose(params: ParamsDollarResourceDollarObjectsDollarCompose, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def compose(
    params: ParamsDollarResourceDollarObjectsDollarCompose,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.copy
    * @desc Copies a source object to a destination object. Optionally
    * overrides metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to find the source object.
    *     sourceBucket: 'my-source-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the source object. For information about how to URL encode
    * object names to be path safe,
    *     // see Encoding URI Path Parts.
    *     sourceObject: 'my-source-object',  // TODO: Update placeholder value.
    *
    *     // Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's
    *     // bucket value, if any.For information about how to URL encode
    * object names to be path safe, see
    *     // Encoding URI Path Parts.
    *     destinationBucket: 'my-destination-bucket',  // TODO: Update
    * placeholder value.
    *
    *     // Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the
    *     // object metadata's name value, if any.
    *     destinationObject: 'my-destination-object',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.copy(request, function(err, response) {
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
    * @alias storage.objects.copy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string} params.destinationObject Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any.
    * @param {string=} params.destinationPredefinedAcl Apply a predefined set of access controls to the destination object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the destination object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the destination object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    * @param {string=} params.ifSourceGenerationMatch Makes the operation conditional on whether the source object's current generation matches the given value.
    * @param {string=} params.ifSourceGenerationNotMatch Makes the operation conditional on whether the source object's current generation does not match the given value.
    * @param {string=} params.ifSourceMetagenerationMatch Makes the operation conditional on whether the source object's current metageneration matches the given value.
    * @param {string=} params.ifSourceMetagenerationNotMatch Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param {string} params.sourceBucket Name of the bucket in which to find the source object.
    * @param {string=} params.sourceGeneration If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    * @param {string} params.sourceObject Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def copy(): GaxiosPromise[Schema$Object] = js.native
  def copy(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy): GaxiosPromise[Schema$Object] = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy, callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def copy(
    params: ParamsDollarResourceDollarObjectsDollarCopy,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def copy(params: ParamsDollarResourceDollarObjectsDollarCopy, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def copy(
    params: ParamsDollarResourceDollarObjectsDollarCopy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.delete
    * @desc Deletes an object and its metadata. Deletions are permanent if
    * versioning is not enabled for the bucket, or if the generation parameter
    * is used.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.delete(request, function(err) {
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
    * @alias storage.objects.delete
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, permanently deletes a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def delete(): GaxiosPromise[Unit] = js.native
  def delete(callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete): GaxiosPromise[Unit] = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete, callback: BodyResponseCallback[Unit]): Unit = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectsDollarDelete,
    options: BodyResponseCallback[Unit],
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  def delete(params: ParamsDollarResourceDollarObjectsDollarDelete, options: MethodOptions): GaxiosPromise[Unit] = js.native
  def delete(
    params: ParamsDollarResourceDollarObjectsDollarDelete,
    options: MethodOptions,
    callback: BodyResponseCallback[Unit]
  ): Unit = js.native
  /**
    * storage.objects.get
    * @desc Retrieves an object or its metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // TODO: To download media content, use:
    *     //
    *     // alt: 'media',
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.get(request, function(err, response) {
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
    * @alias storage.objects.get
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def get(): GaxiosPromise[Schema$Object] = js.native
  def get(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet): GaxiosPromise[Schema$Object] = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet, callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def get(
    params: ParamsDollarResourceDollarObjectsDollarGet,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def get(params: ParamsDollarResourceDollarObjectsDollarGet, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def get(
    params: ParamsDollarResourceDollarObjectsDollarGet,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.getIamPolicy
    * @desc Returns an IAM policy for the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.getIamPolicy(request, function(err, response) {
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
    * @alias storage.objects.getIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def getIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarObjectsDollarGetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarGetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarGetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def getIamPolicy(params: ParamsDollarResourceDollarObjectsDollarGetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def getIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarGetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * storage.objects.insert
    * @desc Stores a new object and metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's
    *     // bucket value, if any.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     media: {
    *       // TODO: Add desired media content for upload. See
    *       // https://github.com/google/google-api-nodejs-client#media-uploads
    *       mimeType: '',  // See
    * https://www.w3.org/Protocols/rfc1341/4_Content-Type.html body: '',
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.insert(request, function(err, response) {
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
    * @alias storage.objects.insert
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string=} params.contentEncoding If set, sets the contentEncoding property of the final object to this value. Setting this parameter is equivalent to setting the contentEncoding metadata property. This can be useful when uploading an object with uploadType=media to indicate the encoding of the content being uploaded.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string=} params.kmsKeyName Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    * @param {string=} params.name Name of the object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this object.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param  {object} params.resource Media resource metadata
    * @param {object} params.media Media object
    * @param {string} params.media.mimeType Media mime-type
    * @param {string|object} params.media.body Media body contents
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def insert(): GaxiosPromise[Schema$Object] = js.native
  def insert(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectsDollarInsert): GaxiosPromise[Schema$Object] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def insert(params: ParamsDollarResourceDollarObjectsDollarInsert, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def insert(
    params: ParamsDollarResourceDollarObjectsDollarInsert,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.list
    * @desc Retrieves a list of objects matching the criteria.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
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
    *     var itemsPage = response['items'];
    *     if (!itemsPage) {
    *       return;
    *     }
    *     for (var i = 0; i < itemsPage.length; i++) {
    *       // TODO: Change code below to process each resource in `itemsPage`:
    *       console.log(JSON.stringify(itemsPage[i], null, 2));
    *     }
    *
    *     if (response.nextPageToken) {
    *       request.pageToken = response.nextPageToken;
    *       storage.objects.list(request, handlePage);
    *     }
    *   };
    *
    *   storage.objects.list(request, handlePage);
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
    * @alias storage.objects.list
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {boolean=} params.includeTrailingDelimiter If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {boolean=} params.versions If true, lists all versions of an object as distinct results. The default is false. For more information, see Object Versioning.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def list(): GaxiosPromise[Schema$Objects] = js.native
  def list(callback: BodyResponseCallback[Schema$Objects]): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectsDollarList): GaxiosPromise[Schema$Objects] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    options: BodyResponseCallback[Schema$Objects],
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  def list(params: ParamsDollarResourceDollarObjectsDollarList, options: MethodOptions): GaxiosPromise[Schema$Objects] = js.native
  def list(
    params: ParamsDollarResourceDollarObjectsDollarList,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Objects]
  ): Unit = js.native
  /**
    * storage.objects.patch
    * @desc Patches an object's metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body. Only these
    * properties
    *       // will be changed.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.patch(request, function(err, response) {
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
    * @alias storage.objects.patch
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {string=} params.userProject The project to be billed for this request, for Requester Pays buckets.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def patch(): GaxiosPromise[Schema$Object] = js.native
  def patch(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectsDollarPatch): GaxiosPromise[Schema$Object] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def patch(params: ParamsDollarResourceDollarObjectsDollarPatch, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def patch(
    params: ParamsDollarResourceDollarObjectsDollarPatch,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.rewrite
    * @desc Rewrites a source object to a destination object. Optionally
    * overrides metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to find the source object.
    *     sourceBucket: 'my-source-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the source object. For information about how to URL encode
    * object names to be path safe,
    *     // see Encoding URI Path Parts.
    *     sourceObject: 'my-source-object',  // TODO: Update placeholder value.
    *
    *     // Name of the bucket in which to store the new object. Overrides the
    * provided object metadata's
    *     // bucket value, if any.
    *     destinationBucket: 'my-destination-bucket',  // TODO: Update
    * placeholder value.
    *
    *     // Name of the new object. Required when the object metadata is not
    * otherwise provided. Overrides the
    *     // object metadata's name value, if any. For information about how to
    * URL encode object names to be
    *     // path safe, see Encoding URI Path Parts.
    *     destinationObject: 'my-destination-object',  // TODO: Update
    * placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.rewrite(request, function(err, response) {
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
    * @alias storage.objects.rewrite
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.destinationBucket Name of the bucket in which to store the new object. Overrides the provided object metadata's bucket value, if any.
    * @param {string=} params.destinationKmsKeyName Resource name of the Cloud KMS key, of the form projects/my-project/locations/global/keyRings/my-kr/cryptoKeys/my-key, that will be used to encrypt the object. Overrides the object metadata's kms_key_name value, if any.
    * @param {string} params.destinationObject Name of the new object. Required when the object metadata is not otherwise provided. Overrides the object metadata's name value, if any. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.destinationPredefinedAcl Apply a predefined set of access controls to the destination object.
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the destination object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the destination object's current metageneration does not match the given value.
    * @param {string=} params.ifSourceGenerationMatch Makes the operation conditional on whether the source object's current generation matches the given value.
    * @param {string=} params.ifSourceGenerationNotMatch Makes the operation conditional on whether the source object's current generation does not match the given value.
    * @param {string=} params.ifSourceMetagenerationMatch Makes the operation conditional on whether the source object's current metageneration matches the given value.
    * @param {string=} params.ifSourceMetagenerationNotMatch Makes the operation conditional on whether the source object's current metageneration does not match the given value.
    * @param {string=} params.maxBytesRewrittenPerCall The maximum number of bytes that will be rewritten per rewrite request. Most callers shouldn't need to specify this parameter - it is primarily in place to support testing. If specified the value must be an integral multiple of 1 MiB (1048576). Also, this only applies to requests where the source and destination span locations and/or storage classes. Finally, this value must not change across rewrite calls else you'll get an error that the rewriteToken is invalid.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl, unless the object resource specifies the acl property, when it defaults to full.
    * @param {string=} params.rewriteToken Include this field (from the previous rewrite response) on each rewrite request after the first one, until the rewrite response 'done' flag is true. Calls that provide a rewriteToken can omit all other request fields, but if included those fields must match the values provided in the first rewrite request.
    * @param {string} params.sourceBucket Name of the bucket in which to find the source object.
    * @param {string=} params.sourceGeneration If present, selects a specific revision of the source object (as opposed to the latest version, the default).
    * @param {string} params.sourceObject Name of the source object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def rewrite(): GaxiosPromise[Schema$RewriteResponse] = js.native
  def rewrite(callback: BodyResponseCallback[Schema$RewriteResponse]): Unit = js.native
  def rewrite(params: ParamsDollarResourceDollarObjectsDollarRewrite): GaxiosPromise[Schema$RewriteResponse] = js.native
  def rewrite(
    params: ParamsDollarResourceDollarObjectsDollarRewrite,
    callback: BodyResponseCallback[Schema$RewriteResponse]
  ): Unit = js.native
  def rewrite(
    params: ParamsDollarResourceDollarObjectsDollarRewrite,
    options: BodyResponseCallback[Schema$RewriteResponse],
    callback: BodyResponseCallback[Schema$RewriteResponse]
  ): Unit = js.native
  def rewrite(params: ParamsDollarResourceDollarObjectsDollarRewrite, options: MethodOptions): GaxiosPromise[Schema$RewriteResponse] = js.native
  def rewrite(
    params: ParamsDollarResourceDollarObjectsDollarRewrite,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$RewriteResponse]
  ): Unit = js.native
  /**
    * storage.objects.setIamPolicy
    * @desc Updates an IAM policy for the specified object.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
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
    *   storage.objects.setIamPolicy(request, function(err, response) {
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
    * @alias storage.objects.setIamPolicy
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Policy} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def setIamPolicy(): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(callback: BodyResponseCallback[Schema$Policy]): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarObjectsDollarSetiampolicy): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarSetiampolicy,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarSetiampolicy,
    options: BodyResponseCallback[Schema$Policy],
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  def setIamPolicy(params: ParamsDollarResourceDollarObjectsDollarSetiampolicy, options: MethodOptions): GaxiosPromise[Schema$Policy] = js.native
  def setIamPolicy(
    params: ParamsDollarResourceDollarObjectsDollarSetiampolicy,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Policy]
  ): Unit = js.native
  /**
    * storage.objects.testIamPermissions
    * @desc Tests a set of permissions on the given object to see which, if
    * any, are held by the caller.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
    *
    *     // Permissions to test.
    *     permissions: [],  // TODO: Update placeholder value.
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.testIamPermissions(request, function(err, response) {
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
    * @alias storage.objects.testIamPermissions
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string} params.permissions Permissions to test.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def testIamPermissions(): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarObjectsDollarTestiampermissions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarObjectsDollarTestiampermissions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarObjectsDollarTestiampermissions,
    options: BodyResponseCallback[Schema$TestIamPermissionsResponse],
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  def testIamPermissions(params: ParamsDollarResourceDollarObjectsDollarTestiampermissions, options: MethodOptions): GaxiosPromise[Schema$TestIamPermissionsResponse] = js.native
  def testIamPermissions(
    params: ParamsDollarResourceDollarObjectsDollarTestiampermissions,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$TestIamPermissionsResponse]
  ): Unit = js.native
  /**
    * storage.objects.update
    * @desc Updates an object's metadata.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which the object resides.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     // Name of the object. For information about how to URL encode object
    * names to be path safe, see
    *     // Encoding URI Path Parts.
    *     object: 'my-object',  // TODO: Update placeholder value.
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
    *   storage.objects.update(request, function(err, response) {
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
    * @alias storage.objects.update
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which the object resides.
    * @param {string=} params.generation If present, selects a specific revision of this object (as opposed to the latest version, the default).
    * @param {string=} params.ifGenerationMatch Makes the operation conditional on whether the object's current generation matches the given value. Setting to 0 makes the operation succeed only if there are no live versions of the object.
    * @param {string=} params.ifGenerationNotMatch Makes the operation conditional on whether the object's current generation does not match the given value. If no live object exists, the precondition fails. Setting to 0 makes the operation succeed only if there is a live version of the object.
    * @param {string=} params.ifMetagenerationMatch Makes the operation conditional on whether the object's current metageneration matches the given value.
    * @param {string=} params.ifMetagenerationNotMatch Makes the operation conditional on whether the object's current metageneration does not match the given value.
    * @param {string} params.object Name of the object. For information about how to URL encode object names to be path safe, see Encoding URI Path Parts.
    * @param {string=} params.predefinedAcl Apply a predefined set of access controls to this object.
    * @param {string=} params.projection Set of properties to return. Defaults to full.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {().Object} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def update(): GaxiosPromise[Schema$Object] = js.native
  def update(callback: BodyResponseCallback[Schema$Object]): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectsDollarUpdate): GaxiosPromise[Schema$Object] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    options: BodyResponseCallback[Schema$Object],
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  def update(params: ParamsDollarResourceDollarObjectsDollarUpdate, options: MethodOptions): GaxiosPromise[Schema$Object] = js.native
  def update(
    params: ParamsDollarResourceDollarObjectsDollarUpdate,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Object]
  ): Unit = js.native
  /**
    * storage.objects.watchAll
    * @desc Watch for changes on all objects in a bucket.
    * @example
    * * // BEFORE RUNNING:
    * // ---------------
    * // 1. If not already done, enable the Cloud Storage JSON API
    * //    and check the quota for your project at
    * //    https://console.developers.google.com/apis/api/storage
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
    * var storage = google.storage('v1');
    *
    * authorize(function(authClient) {
    *   var request = {
    *     // Name of the bucket in which to look for objects.
    *     bucket: 'my-bucket',  // TODO: Update placeholder value.
    *
    *     resource: {
    *       // TODO: Add desired properties to the request body.
    *     },
    *
    *     auth: authClient,
    *   };
    *
    *   storage.objects.watchAll(request, function(err, response) {
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
    * @alias storage.objects.watchAll
    * @memberOf! ()
    *
    * @param {object} params Parameters for request
    * @param {string} params.bucket Name of the bucket in which to look for objects.
    * @param {string=} params.delimiter Returns results in a directory-like mode. items will contain only objects whose names, aside from the prefix, do not contain delimiter. Objects whose names, aside from the prefix, contain delimiter will have their name, truncated after the delimiter, returned in prefixes. Duplicate prefixes are omitted.
    * @param {boolean=} params.includeTrailingDelimiter If true, objects that end in exactly one instance of delimiter will have their metadata included in items in addition to prefixes.
    * @param {integer=} params.maxResults Maximum number of items plus prefixes to return in a single page of responses. As duplicate prefixes are omitted, fewer total results may be returned than requested. The service will use this parameter or 1,000 items, whichever is smaller.
    * @param {string=} params.pageToken A previously-returned page token representing part of the larger set of results to view.
    * @param {string=} params.prefix Filter results to objects whose names begin with this prefix.
    * @param {string=} params.projection Set of properties to return. Defaults to noAcl.
    * @param {string=} params.userProject The project to be billed for this request. Required for Requester Pays buckets.
    * @param {boolean=} params.versions If true, lists all versions of an object as distinct results. The default is false. For more information, see Object Versioning.
    * @param {().Channel} params.resource Request body data
    * @param {object} [options] Optionally override request options, such as `url`, `method`, and `encoding`.
    * @param {callback} callback The callback that handles the response.
    * @return {object} Request object
    */
  def watchAll(): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(callback: BodyResponseCallback[Schema$Channel]): Unit = js.native
  def watchAll(params: ParamsDollarResourceDollarObjectsDollarWatchall): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    options: BodyResponseCallback[Schema$Channel],
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
  def watchAll(params: ParamsDollarResourceDollarObjectsDollarWatchall, options: MethodOptions): GaxiosPromise[Schema$Channel] = js.native
  def watchAll(
    params: ParamsDollarResourceDollarObjectsDollarWatchall,
    options: MethodOptions,
    callback: BodyResponseCallback[Schema$Channel]
  ): Unit = js.native
}

