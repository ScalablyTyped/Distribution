package typings.devexpressDashWeb

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

