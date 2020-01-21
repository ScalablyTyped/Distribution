package typings.ejWebAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PPTFormats with Double] = js.native
  /* 1 */ @js.native
  object PowerPoint2007 extends TopLevel[PowerPoint2007 with Double]
  
  /* 2 */ @js.native
  object PowerPoint2010 extends TopLevel[PowerPoint2010 with Double]
  
  /* 3 */ @js.native
  object PowerPoint2013 extends TopLevel[PowerPoint2013 with Double]
  
  /* 0 */ @js.native
  object PowerPoint97to2003 extends TopLevel[PowerPoint97to2003 with Double]
  
}

