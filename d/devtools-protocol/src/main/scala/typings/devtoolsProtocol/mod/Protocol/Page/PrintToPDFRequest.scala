package typings.devtoolsProtocol.mod.Protocol.Page

import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsBase64
import typings.devtoolsProtocol.devtoolsProtocolStrings.ReturnAsStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintToPDFRequest extends StObject {
  
  /**
    * Display header and footer. Defaults to false.
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML template for the print footer. Should use the same format as the `headerTemplate`.
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * HTML template for the print header. Should be valid HTML markup with following
    * classes used to inject printing values into them:
    * - `date`: formatted print date
    * - `title`: document title
    * - `url`: document location
    * - `pageNumber`: current page number
    * - `totalPages`: total pages in the document
    * 
    * For example, `<span class=title></span>` would generate span containing the title.
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Paper orientation. Defaults to false.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Bottom margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginBottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Left margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginLeft: js.UndefOr[Double] = js.undefined
  
  /**
    * Right margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginRight: js.UndefOr[Double] = js.undefined
  
  /**
    * Top margin in inches. Defaults to 1cm (~0.4 inches).
    */
  var marginTop: js.UndefOr[Double] = js.undefined
  
  /**
    * Paper ranges to print, one based, e.g., '1-5, 8, 11-13'. Pages are
    * printed in the document order, not in the order specified, and no
    * more than once.
    * Defaults to empty string, which implies the entire document is printed.
    * The page numbers are quietly capped to actual page count of the
    * document, and ranges beyond the end of the document are ignored.
    * If this results in no pages to print, an error is reported.
    * It is an error to specify a range with start greater than end.
    */
  var pageRanges: js.UndefOr[String] = js.undefined
  
  /**
    * Paper height in inches. Defaults to 11 inches.
    */
  var paperHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * Paper width in inches. Defaults to 8.5 inches.
    */
  var paperWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to prefer page size as defined by css. Defaults to false,
    * in which case the content will be scaled to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Print background graphics. Defaults to false.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scale of the webpage rendering. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * return as stream (PrintToPDFRequestTransferMode enum)
    */
  var transferMode: js.UndefOr[ReturnAsBase64 | ReturnAsStream] = js.undefined
}
object PrintToPDFRequest {
  
  inline def apply(): PrintToPDFRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintToPDFRequest] (val x: Self) extends AnyVal {
    
    inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
    
    inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMarginBottom(value: Double): Self = StObject.set(x, "marginBottom", value.asInstanceOf[js.Any])
    
    inline def setMarginBottomUndefined: Self = StObject.set(x, "marginBottom", js.undefined)
    
    inline def setMarginLeft(value: Double): Self = StObject.set(x, "marginLeft", value.asInstanceOf[js.Any])
    
    inline def setMarginLeftUndefined: Self = StObject.set(x, "marginLeft", js.undefined)
    
    inline def setMarginRight(value: Double): Self = StObject.set(x, "marginRight", value.asInstanceOf[js.Any])
    
    inline def setMarginRightUndefined: Self = StObject.set(x, "marginRight", js.undefined)
    
    inline def setMarginTop(value: Double): Self = StObject.set(x, "marginTop", value.asInstanceOf[js.Any])
    
    inline def setMarginTopUndefined: Self = StObject.set(x, "marginTop", js.undefined)
    
    inline def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    inline def setPaperHeight(value: Double): Self = StObject.set(x, "paperHeight", value.asInstanceOf[js.Any])
    
    inline def setPaperHeightUndefined: Self = StObject.set(x, "paperHeight", js.undefined)
    
    inline def setPaperWidth(value: Double): Self = StObject.set(x, "paperWidth", value.asInstanceOf[js.Any])
    
    inline def setPaperWidthUndefined: Self = StObject.set(x, "paperWidth", js.undefined)
    
    inline def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
    
    inline def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
    
    inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setTransferMode(value: ReturnAsBase64 | ReturnAsStream): Self = StObject.set(x, "transferMode", value.asInstanceOf[js.Any])
    
    inline def setTransferModeUndefined: Self = StObject.set(x, "transferMode", js.undefined)
  }
}
