package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentFormat extends js.Object

@JSGlobal("DocumentFormat")
@js.native
object DocumentFormat extends js.Object {
  @js.native
  sealed trait Doc extends DocumentFormat
  
  @js.native
  sealed trait Html extends DocumentFormat
  
  @js.native
  sealed trait Mht extends DocumentFormat
  
  @js.native
  sealed trait OpenDocument extends DocumentFormat
  
  @js.native
  sealed trait OpenXml extends DocumentFormat
  
  @js.native
  sealed trait PlainText extends DocumentFormat
  
  @js.native
  sealed trait Rtf extends DocumentFormat
  
  @js.native
  sealed trait Undefined extends DocumentFormat
  
  @js.native
  sealed trait WordML extends DocumentFormat
  
  @js.native
  sealed trait ePub extends DocumentFormat
  
  /* 10 */ val Doc: typings.devexpressDashWeb.DocumentFormat.Doc with Double = js.native
  /* 3 */ val Html: typings.devexpressDashWeb.DocumentFormat.Html with Double = js.native
  /* 5 */ val Mht: typings.devexpressDashWeb.DocumentFormat.Mht with Double = js.native
  /* 7 */ val OpenDocument: typings.devexpressDashWeb.DocumentFormat.OpenDocument with Double = js.native
  /* 4 */ val OpenXml: typings.devexpressDashWeb.DocumentFormat.OpenXml with Double = js.native
  /* 1 */ val PlainText: typings.devexpressDashWeb.DocumentFormat.PlainText with Double = js.native
  /* 2 */ val Rtf: typings.devexpressDashWeb.DocumentFormat.Rtf with Double = js.native
  /* 0 */ val Undefined: typings.devexpressDashWeb.DocumentFormat.Undefined with Double = js.native
  /* 6 */ val WordML: typings.devexpressDashWeb.DocumentFormat.WordML with Double = js.native
  /* 9 */ val ePub: typings.devexpressDashWeb.DocumentFormat.ePub with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentFormat with Double] = js.native
}

