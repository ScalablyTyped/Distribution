package typings.googleapis.buildSrcApisFitnessV1Mod.fitness_v1

import typings.googleapisDashCommon.buildSrcApiMod.APIRequestContext
import typings.googleapisDashCommon.buildSrcApiMod.GlobalOptions
import typings.googleapisDashCommon.buildSrcApiMod.GoogleConfigurable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fitness
  *
  * Stores and accesses user data in the fitness store from apps on any
  * platform.
  *
  * @example
  * const {google} = require('googleapis');
  * const fitness = google.fitness('v1');
  *
  * @namespace fitness
  * @type {Function}
  * @version v1
  * @variation v1
  * @param {object=} options Options for Fitness
  */
@JSImport("googleapis/build/src/apis/fitness/v1", "fitness_v1.Fitness")
@js.native
class Fitness protected () extends js.Object {
  def this(options: GlobalOptions) = this()
  def this(options: GlobalOptions, google: GoogleConfigurable) = this()
  var context: APIRequestContext = js.native
  var users: Resource$Users = js.native
}

