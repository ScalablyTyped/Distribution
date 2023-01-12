package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintToPDFOptions extends StObject {
  
  /**
    * Whether to display header and footer. Defaults to false.
    */
  var displayHeaderFooter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * HTML template for the print footer. Should use the same format as the
    * `headerTemplate`.
    */
  var footerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * HTML template for the print header. Should be valid HTML markup with following
    * classes used to inject printing values into them: `date` (formatted print date),
    * `title` (document title), `url` (document location), `pageNumber` (current page
    * number) and `totalPages` (total pages in the document). For example, `<span
    * class=title></span>` would generate span containing the title.
    */
  var headerTemplate: js.UndefOr[String] = js.undefined
  
  /**
    * Paper orientation.`true` for landscape, `false` for portrait. Defaults to false.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  var margins: js.UndefOr[Margins] = js.undefined
  
  /**
    * Paper ranges to print, e.g., '1-5, 8, 11-13'. Defaults to the empty string,
    * which means print all pages.
    */
  var pageRanges: js.UndefOr[String] = js.undefined
  
  /**
    * Specify page size of the generated PDF. Can be `A0`, `A1`, `A2`, `A3`, `A4`,
    * `A5`, `A6`, `Legal`, `Letter`, `Tabloid`, `Ledger`, or an Object containing
    * `height` and `width` in inches. Defaults to `Letter`.
    */
  var pageSize: js.UndefOr[String | Size] = js.undefined
  
  /**
    * Whether or not to prefer page size as defined by css. Defaults to false, in
    * which case the content will be scaled to fit the paper size.
    */
  var preferCSSPageSize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to print background graphics. Defaults to false.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Scale of the webpage rendering. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.undefined
}
object PrintToPDFOptions {
  
  inline def apply(): PrintToPDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintToPDFOptions] (val x: Self) extends AnyVal {
    
    inline def setDisplayHeaderFooter(value: Boolean): Self = StObject.set(x, "displayHeaderFooter", value.asInstanceOf[js.Any])
    
    inline def setDisplayHeaderFooterUndefined: Self = StObject.set(x, "displayHeaderFooter", js.undefined)
    
    inline def setFooterTemplate(value: String): Self = StObject.set(x, "footerTemplate", value.asInstanceOf[js.Any])
    
    inline def setFooterTemplateUndefined: Self = StObject.set(x, "footerTemplate", js.undefined)
    
    inline def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
    
    inline def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    inline def setPageRanges(value: String): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    inline def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    inline def setPageSize(value: String | Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPreferCSSPageSize(value: Boolean): Self = StObject.set(x, "preferCSSPageSize", value.asInstanceOf[js.Any])
    
    inline def setPreferCSSPageSizeUndefined: Self = StObject.set(x, "preferCSSPageSize", js.undefined)
    
    inline def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    inline def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
