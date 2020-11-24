package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PPTFormats extends js.Object
@JSGlobal("ej.ReportViewer.PPTFormats")
@js.native
object PPTFormats extends js.Object {
  
  ///Represents PowerPoint2007 version.
  @js.native
  sealed trait PowerPoint2007 extends PPTFormats
  
  ///Represents PowerPoint2010 version.
  @js.native
  sealed trait PowerPoint2010 extends PPTFormats
  
  ///Represents PowerPoint2013 version.
  @js.native
  sealed trait PowerPoint2013 extends PPTFormats
  
  ///Represents PowerPoint97to2003 version.
  @js.native
  sealed trait PowerPoint97to2003 extends PPTFormats
}
