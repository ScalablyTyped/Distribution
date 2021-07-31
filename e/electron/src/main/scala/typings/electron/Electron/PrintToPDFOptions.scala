package typings.electron.Electron

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintToPDFOptions extends StObject {
  
  /**
    * the header and footer for the PDF.
    */
  var headerFooter: js.UndefOr[Record[String, String]] = js.undefined
  
  /**
    * `true` for landscape, `false` for portrait.
    */
  var landscape: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the type of margins to use. Uses 0 for default margin, 1 for no
    * margin, and 2 for minimum margin. and `width` in microns.
    */
  var marginsType: js.UndefOr[Double] = js.undefined
  
  /**
    * The page range to print.
    */
  var pageRanges: js.UndefOr[Record[String, Double]] = js.undefined
  
  /**
    * Specify page size of the generated PDF. Can be `A3`, `A4`, `A5`, `Legal`,
    * `Letter`, `Tabloid` or an Object containing `height`
    */
  var pageSize: js.UndefOr[String | Size] = js.undefined
  
  /**
    * Whether to print CSS backgrounds.
    */
  var printBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to print selection only.
    */
  var printSelectionOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The scale factor of the web page. Can range from 0 to 100.
    */
  var scaleFactor: js.UndefOr[Double] = js.undefined
}
object PrintToPDFOptions {
  
  @scala.inline
  def apply(): PrintToPDFOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintToPDFOptions]
  }
  
  @scala.inline
  implicit class PrintToPDFOptionsMutableBuilder[Self <: PrintToPDFOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaderFooter(value: Record[String, String]): Self = StObject.set(x, "headerFooter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderFooterUndefined: Self = StObject.set(x, "headerFooter", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setMarginsType(value: Double): Self = StObject.set(x, "marginsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginsTypeUndefined: Self = StObject.set(x, "marginsType", js.undefined)
    
    @scala.inline
    def setPageRanges(value: Record[String, Double]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    @scala.inline
    def setPageSize(value: String | Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    @scala.inline
    def setPrintSelectionOnly(value: Boolean): Self = StObject.set(x, "printSelectionOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintSelectionOnlyUndefined: Self = StObject.set(x, "printSelectionOnly", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
  }
}
