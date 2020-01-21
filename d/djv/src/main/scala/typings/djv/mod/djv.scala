package typings.djv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait djv extends js.Object {
  var resolved: Resolved = js.native
  def addFormat(name: String, formatter: String): Unit = js.native
  def addFormat(name: String, formatter: js.Function2[/* schema */ js.Object, /* tpl */ js.Any, Unit]): Unit = js.native
  def addSchema(nameOrSchema: String): Resolved = js.native
  def addSchema(nameOrSchema: String, schema: js.Object): Resolved = js.native
  def addSchema(nameOrSchema: js.Object): Resolved = js.native
  def addSchema(nameOrSchema: js.Object, schema: js.Object): Resolved = js.native
  def export(): String = js.native
  def export(name: String): String = js.native
  def `import`(config: js.Object): Unit = js.native
  def removeSchema(name: String): Unit = js.native
  def resolve(name: String): Resolved = js.native
  def resolve(name: js.Object): Resolved = js.native
  def setErrorHandler(errorHandler: js.Function2[/* errorType */ String, /* property */ js.Any, String]): Unit = js.native
  def useVersion(version: String): Unit = js.native
  def useVersion(version: String, configure: js.Any): Unit = js.native
  def validate(name: String, `object`: js.Object): js.UndefOr[String] = js.native
}

