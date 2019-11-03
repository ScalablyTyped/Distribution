package typings.edgeDashJs.edgeDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var assemblyFile: String
  var methodName: js.UndefOr[String] = js.undefined
  var typeName: js.UndefOr[String] = js.undefined
}

object Params {
  @scala.inline
  def apply(assemblyFile: String, methodName: String = null, typeName: String = null): Params = {
    val __obj = js.Dynamic.literal(assemblyFile = assemblyFile)
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    if (typeName != null) __obj.updateDynamic("typeName")(typeName)
    __obj.asInstanceOf[Params]
  }
}

