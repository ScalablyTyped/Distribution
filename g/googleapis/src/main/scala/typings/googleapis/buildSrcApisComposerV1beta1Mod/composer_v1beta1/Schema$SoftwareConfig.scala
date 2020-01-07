package typings.googleapis.buildSrcApisComposerV1beta1Mod.composer_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specifies the selection and configuration of software inside the
  * environment.
  */
@js.native
trait Schema$SoftwareConfig extends js.Object {
  /**
    * Optional. Apache Airflow configuration properties to override.  Property
    * keys contain the section and property names, separated by a hyphen, for
    * example &quot;core-dags_are_paused_at_creation&quot;. Section names must
    * not contain hyphens (&quot;-&quot;), opening square brackets
    * (&quot;[&quot;),  or closing square brackets (&quot;]&quot;). The
    * property name must not be empty and must not contain an equals sign
    * (&quot;=&quot;) or semicolon (&quot;;&quot;). Section and property names
    * must not contain a period (&quot;.&quot;). Apache Airflow configuration
    * property names must be written in
    * [snake_case](https://en.wikipedia.org/wiki/Snake_case). Property values
    * can contain any character, and can be written in any lower/upper case
    * format.  Certain Apache Airflow configuration property values are
    * [blacklisted](/composer/docs/how-to/managing/setting-airflow-configurations#airflow_configuration_blacklists),
    * and cannot be overridden.
    */
  var airflowConfigOverrides: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. Additional environment variables to provide to the Apache
    * Airflow scheduler, worker, and webserver processes.  Environment variable
    * names must match the regular expression `a-zA-Z_*`. They cannot specify
    * Apache Airflow software configuration overrides (they cannot match the
    * regular expression `AIRFLOW__[A-Z0-9_]+__[A-Z0-9_]+`), and they cannot
    * match any of the following reserved names:  * `AIRFLOW_HOME` *
    * `C_FORCE_ROOT` * `CONTAINER_NAME` * `DAGS_FOLDER` * `GCP_PROJECT` *
    * `GCS_BUCKET` * `GKE_CLUSTER_NAME` * `SQL_DATABASE` * `SQL_INSTANCE` *
    * `SQL_PASSWORD` * `SQL_PROJECT` * `SQL_REGION` * `SQL_USER`
    */
  var envVariables: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The version of the software running in the environment. This encapsulates
    * both the version of Cloud Composer functionality and the version of
    * Apache Airflow. It must match the regular expression
    * `composer-([0-9]+\.[0-9]+\.[0-9]+|latest)-airflow-[0-9]+\.[0-9]+(\.[0-9]+.*)?`.
    * When used as input, the server also checks if the provided version is
    * supported and denies the request for an unsupported version.  The Cloud
    * Composer portion of the version is a [semantic
    * version](https://semver.org) or `latest`. When the patch version is
    * omitted, the current Cloud Composer patch version is selected. When
    * `latest` is provided instead of an explicit version number, the server
    * replaces `latest` with the current Cloud Composer version and stores that
    * version number in the same field.  The portion of the image version that
    * follows &lt;em&gt;airflow-&lt;/em&gt; is an official Apache Airflow
    * repository [release
    * name](https://github.com/apache/incubator-airflow/releases).  See also
    * [Version List](/composer/docs/concepts/versioning/composer-versions).
    */
  var imageVersion: js.UndefOr[String] = js.native
  /**
    * Optional. Custom Python Package Index (PyPI) packages to be installed in
    * the environment.  Keys refer to the lowercase package name such as
    * &quot;numpy&quot; and values are the lowercase extras and version
    * specifier such as &quot;==1.12.0&quot;, &quot;[devel,gcp_api]&quot;, or
    * &quot;[devel]&gt;=1.8.2, &lt;1.9.2&quot;. To specify a package without
    * pinning it to a version specifier, use the empty string as the value.
    */
  var pypiPackages: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * Optional. The major version of Python used to run the Apache Airflow
    * scheduler, worker, and webserver processes.  Can be set to &#39;2&#39; or
    * &#39;3&#39;. If not specified, the default is &#39;2&#39;. Cannot be
    * updated.
    */
  var pythonVersion: js.UndefOr[String] = js.native
}

object Schema$SoftwareConfig {
  @scala.inline
  def apply(
    airflowConfigOverrides: StringDictionary[String] = null,
    envVariables: StringDictionary[String] = null,
    imageVersion: String = null,
    pypiPackages: StringDictionary[String] = null,
    pythonVersion: String = null
  ): Schema$SoftwareConfig = {
    val __obj = js.Dynamic.literal()
    if (airflowConfigOverrides != null) __obj.updateDynamic("airflowConfigOverrides")(airflowConfigOverrides.asInstanceOf[js.Any])
    if (envVariables != null) __obj.updateDynamic("envVariables")(envVariables.asInstanceOf[js.Any])
    if (imageVersion != null) __obj.updateDynamic("imageVersion")(imageVersion.asInstanceOf[js.Any])
    if (pypiPackages != null) __obj.updateDynamic("pypiPackages")(pypiPackages.asInstanceOf[js.Any])
    if (pythonVersion != null) __obj.updateDynamic("pythonVersion")(pythonVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SoftwareConfig]
  }
}

