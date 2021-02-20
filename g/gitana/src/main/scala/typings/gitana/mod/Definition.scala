package typings.gitana.mod

import org.scalablytyped.runtime.StObject
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
object Definition {
  
  /* static member */
  @JSImport("gitana", "Definition.extend")
  @js.native
  def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Definition.forEach")
  @js.native
  def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("gitana", "Definition.implement")
  @js.native
  def implement(args: js.Any*): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Definition.toString")
  @js.native
  def toString_(): js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "Definition.valueOf")
  @js.native
  def valueOf_(`type`: js.Any): js.Any = js.native
}
