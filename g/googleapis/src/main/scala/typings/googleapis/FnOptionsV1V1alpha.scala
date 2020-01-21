package typings.googleapis

import typings.googleapis.appengineV1Mod.appengineV1.Appengine
import typings.googleapis.appengineV1Mod.appengineV1.Options
import typings.googleapis.googleapisStrings.v1
import typings.googleapis.googleapisStrings.v1alpha
import typings.googleapis.googleapisStrings.v1beta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnOptionsV1V1alpha extends js.Object {
  def apply(options: Options): Appengine = js.native
  def apply(options: typings.googleapis.appengineV1betaMod.appengineV1beta.Options): typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine = js.native
  def apply(options: typings.googleapis.v1alphaMod.appengineV1alpha.Options): typings.googleapis.v1alphaMod.appengineV1alpha.Appengine = js.native
  def apply(version: v1): Appengine = js.native
  def apply(version: v1alpha): typings.googleapis.v1alphaMod.appengineV1alpha.Appengine = js.native
  def apply(version: v1beta): typings.googleapis.appengineV1betaMod.appengineV1beta.Appengine = js.native
}

