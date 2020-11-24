package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RenderMode extends js.Object
@JSGlobal("ej.ReportViewer.RenderMode")
@js.native
object RenderMode extends js.Object {
  
  ///Specifies the Default property in RenderMode to get default output.
  @js.native
  sealed trait Default extends RenderMode
  
  ///Specifies the Desktop property in RenderMode to get specified output.
  @js.native
  sealed trait Desktop extends RenderMode
  
  ///Specifies the Mobile property in RenderMode to get specified output.
  @js.native
  sealed trait Mobile extends RenderMode
}
