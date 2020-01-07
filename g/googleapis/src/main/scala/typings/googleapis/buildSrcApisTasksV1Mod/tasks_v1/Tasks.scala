package typings.googleapis.buildSrcApisTasksV1Mod.tasks_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Tasks API
  *
  * Manages your tasks and task lists.
  *
  * @example
  * const {google} = require('googleapis');
  * const tasks = google.tasks('v1');
  *
  * @namespace tasks
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Tasks
  */
@JSImport("googleapis/build/src/apis/tasks/v1", "tasks_v1.Tasks")
@js.native
class Tasks protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var tasklists: Resource$Tasklists = js.native
  var tasks: Resource$Tasks = js.native
}

