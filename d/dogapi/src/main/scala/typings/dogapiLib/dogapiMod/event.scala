package typings
package dogapiLib.dogapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait event extends js.Object {
  def create(
    title: java.lang.String,
    text: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* res */ EventCreateResponse, scala.Unit]
  ): scala.Unit = js.native
  def create(
    title: java.lang.String,
    text: java.lang.String,
    properties: dogapiLib.Anon_Aggregationkey,
    callback: js.Function2[/* err */ stdLib.Error | scala.Null, /* res */ EventCreateResponse, scala.Unit]
  ): scala.Unit = js.native
}

