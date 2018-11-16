package typings
package gapiDotClientDotCloudbuildLib.gapiNs.clientNs.cloudbuildNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Build extends js.Object {
  /**
               * The ID of the BuildTrigger that triggered this build, if it was
               * triggered automatically.
               * @OutputOnly
               */
  var buildTriggerId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Time at which the request to create the build was received.
               * @OutputOnly
               */
  var createTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Time at which execution of the build was finished.
               *
               * The difference between finish_time and start_time is the duration of the
               * build's execution.
               * @OutputOnly
               */
  var finishTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Unique identifier of the build.
               * @OutputOnly
               */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
               * A list of images to be pushed upon the successful completion of all build
               * steps.
               *
               * The images will be pushed using the builder service account's credentials.
               *
               * The digests of the pushed images will be stored in the Build resource's
               * results field.
               *
               * If any of the images fail to be pushed, the build is marked FAILURE.
               */
  var images: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * URL to logs for this build in Google Cloud Logging.
               * @OutputOnly
               */
  var logUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Google Cloud Storage bucket where logs should be written (see
               * [Bucket Name
               * Requirements](https://cloud.google.com/storage/docs/bucket-naming#requirements)).
               * Logs file names will be of the format `${logs_bucket}/log-${build_id}.txt`.
               */
  var logsBucket: js.UndefOr[java.lang.String] = js.undefined
  /** Special options for this build. */
  var options: js.UndefOr[BuildOptions] = js.undefined
  /**
               * ID of the project.
               * @OutputOnly.
               */
  var projectId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Results of the build.
               * @OutputOnly
               */
  var results: js.UndefOr[Results] = js.undefined
  /** Secrets to decrypt using Cloud KMS. */
  var secrets: js.UndefOr[js.Array[Secret]] = js.undefined
  /** Describes where to find the source files to build. */
  var source: js.UndefOr[Source] = js.undefined
  /**
               * A permanent fixed identifier for source.
               * @OutputOnly
               */
  var sourceProvenance: js.UndefOr[SourceProvenance] = js.undefined
  /**
               * Time at which execution of the build was started.
               * @OutputOnly
               */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Status of the build.
               * @OutputOnly
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Customer-readable message about the current status.
               * @OutputOnly
               */
  var statusDetail: js.UndefOr[java.lang.String] = js.undefined
  /** Describes the operations to be performed on the workspace. */
  var steps: js.UndefOr[js.Array[BuildStep]] = js.undefined
  /** Substitutions data for Build resource. */
  var substitutions: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  /** Tags for annotation of a Build. These are not docker tags. */
  var tags: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
               * Amount of time that this build should be allowed to run, to second
               * granularity. If this amount of time elapses, work on the build will cease
               * and the build status will be TIMEOUT.
               *
               * Default time is ten minutes.
               */
  var timeout: js.UndefOr[java.lang.String] = js.undefined
}

