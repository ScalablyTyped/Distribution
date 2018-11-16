package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentFormat extends js.Object

@JSGlobal("DocumentFormat")
@js.native
object DocumentFormat extends js.Object {
  @js.native
  sealed trait Doc
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait Html
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait Mht
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait OpenDocument
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait OpenXml
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait PlainText
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait Rtf
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait Undefined
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait WordML
    extends devexpressDashWebLib.DocumentFormat
  
  @js.native
  sealed trait ePub
    extends devexpressDashWebLib.DocumentFormat
  
  /* 10 */ val Doc: Doc with scala.Double = js.native
  /* 3 */ val Html: Html with scala.Double = js.native
  /* 5 */ val Mht: Mht with scala.Double = js.native
  /* 7 */ val OpenDocument: OpenDocument with scala.Double = js.native
  /* 4 */ val OpenXml: OpenXml with scala.Double = js.native
  /* 1 */ val PlainText: PlainText with scala.Double = js.native
  /* 2 */ val Rtf: Rtf with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  /* 6 */ val WordML: WordML with scala.Double = js.native
  /* 9 */ val ePub: ePub with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.DocumentFormat with scala.Double] = js.native
}

