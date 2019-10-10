package typings.ejDotWebDotAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  /* 1 */ val PowerPoint2007: typings.ejDotWebDotAll.ej.ReportViewer.PPTFormats.PowerPoint2007 with Double = js.native
  /* 2 */ val PowerPoint2010: typings.ejDotWebDotAll.ej.ReportViewer.PPTFormats.PowerPoint2010 with Double = js.native
  /* 3 */ val PowerPoint2013: typings.ejDotWebDotAll.ej.ReportViewer.PPTFormats.PowerPoint2013 with Double = js.native
  /* 0 */ val PowerPoint97to2003: typings.ejDotWebDotAll.ej.ReportViewer.PPTFormats.PowerPoint97to2003 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PPTFormats with Double] = js.native
}

