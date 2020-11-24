package typings.gitana.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "Definition")
@js.native
class Definition protected () extends Node {
  def this(branch: js.Any, `object`: js.Any) = this()
  
  def createForm(formKey: js.Any, formObject: js.Any, formPath: js.Any): js.Any = js.native
  
  def listChildDefinitions(pagination: js.Any): js.Any = js.native
  
  def listFormAssociations(): js.Any = js.native
  
  def readForm(formKey: js.Any): js.Any = js.native
  
  def removeFormAssociation(formKey: js.Any): js.Any = js.native
}
/* static members */
@JSImport("gitana", "Definition")
@js.native
object Definition extends js.Object {
  
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  def implement(args: js.Any*): js.Any = js.native
  
  def valueOf(`type`: js.Any): js.Any = js.native
}
