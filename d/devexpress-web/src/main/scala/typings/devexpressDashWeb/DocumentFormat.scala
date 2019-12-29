package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DocumentFormat extends js.Object

/**
  * Lists file document formats.
  */
@JSGlobal("DocumentFormat")
@js.native
object DocumentFormat extends js.Object {
  /**
    * MS Word 97-2003 binary file format.
    */
  @js.native
  sealed trait Doc extends DocumentFormat
  
  /**
    * The HTML format.
    */
  @js.native
  sealed trait Html extends DocumentFormat
  
  /**
    * The MHT format - web page archive format used to save HTML code with resources represented by external links (images etc.), in a single file
    */
  @js.native
  sealed trait Mht extends DocumentFormat
  
  /**
    * The OpenDocument text format (.odt, implemented by OpenOffice.org office suite).
    */
  @js.native
  sealed trait OpenDocument extends DocumentFormat
  
  /**
    * The OpenXML file format (aka default MS Office 2007 format or .docx)
    */
  @js.native
  sealed trait OpenXml extends DocumentFormat
  
  /**
    * The plain text format.
    */
  @js.native
  sealed trait PlainText extends DocumentFormat
  
  /**
    * The Rich Text Format (RTF).
    */
  @js.native
  sealed trait Rtf extends DocumentFormat
  
  /**
    * The document's format is undefined.
    */
  @js.native
  sealed trait Undefined extends DocumentFormat
  
  /**
    * The WordprocessingML format (.xml, implemented in MS Office 2003).
    */
  @js.native
  sealed trait WordML extends DocumentFormat
  
  /**
    * EPUB&#174; - standard format for electronic books and other digital publications.
    */
  @js.native
  sealed trait ePub extends DocumentFormat
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DocumentFormat with Double] = js.native
  /* 10 */ @js.native
  object Doc extends TopLevel[Doc with Double]
  
  /* 3 */ @js.native
  object Html extends TopLevel[Html with Double]
  
  /* 5 */ @js.native
  object Mht extends TopLevel[Mht with Double]
  
  /* 7 */ @js.native
  object OpenDocument extends TopLevel[OpenDocument with Double]
  
  /* 4 */ @js.native
  object OpenXml extends TopLevel[OpenXml with Double]
  
  /* 1 */ @js.native
  object PlainText extends TopLevel[PlainText with Double]
  
  /* 2 */ @js.native
  object Rtf extends TopLevel[Rtf with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
  /* 6 */ @js.native
  object WordML extends TopLevel[WordML with Double]
  
  /* 9 */ @js.native
  object ePub extends TopLevel[ePub with Double]
  
}

