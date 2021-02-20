package typings.electron.Electron

import typings.electron.electronStrings.longEdge
import typings.electron.electronStrings.shortEdge
import typings.electron.electronStrings.simplex
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebContentsPrintOptions extends StObject {
  
  /**
    * Whether the web page should be collated.
    */
  var collate: js.UndefOr[Boolean] = js.native
  
  /**
    * Set whether the printed web page will be in color or grayscale. Default is
    * `true`.
    */
  var color: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of copies of the web page to print.
    */
  var copies: js.UndefOr[Double] = js.native
  
  /**
    * Set the printer device name to use. Must be the system-defined name and not the
    * 'friendly' name, e.g 'Brother_QL_820NWB' and not 'Brother QL-820NWB'.
    */
  var deviceName: js.UndefOr[String] = js.native
  
  var dpi: js.UndefOr[Record[String, Double]] = js.native
  
  /**
    * Set the duplex mode of the printed web page. Can be `simplex`, `shortEdge`, or
    * `longEdge`.
    */
  var duplexMode: js.UndefOr[simplex | shortEdge | longEdge] = js.native
  
  /**
    * String to be printed as page footer.
    */
  var footer: js.UndefOr[String] = js.native
  
  /**
    * String to be printed as page header.
    */
  var header: js.UndefOr[String] = js.native
  
  /**
    * Whether the web page should be printed in landscape mode. Default is `false`.
    */
  var landscape: js.UndefOr[Boolean] = js.native
  
  var margins: js.UndefOr[Margins] = js.native
  
  /**
    * The page range to print. On macOS, only one range is honored.
    */
  var pageRanges: js.UndefOr[js.Array[PageRanges]] = js.native
  
  /**
    * Specify page size of the printed document. Can be `A3`, `A4`, `A5`, `Legal`,
    * `Letter`, `Tabloid` or an Object containing `height`.
    */
  var pageSize: js.UndefOr[String | Size] = js.native
  
  /**
    * The number of pages to print per page sheet.
    */
  var pagesPerSheet: js.UndefOr[Double] = js.native
  
  /**
    * Prints the background color and image of the web page. Default is `false`.
    */
  var printBackground: js.UndefOr[Boolean] = js.native
  
  /**
    * The scale factor of the web page.
    */
  var scaleFactor: js.UndefOr[Double] = js.native
  
  /**
    * Don't ask user for print settings. Default is `false`.
    */
  var silent: js.UndefOr[Boolean] = js.native
}
object WebContentsPrintOptions {
  
  @scala.inline
  def apply(): WebContentsPrintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebContentsPrintOptions]
  }
  
  @scala.inline
  implicit class WebContentsPrintOptionsMutableBuilder[Self <: WebContentsPrintOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCollate(value: Boolean): Self = StObject.set(x, "collate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollateUndefined: Self = StObject.set(x, "collate", js.undefined)
    
    @scala.inline
    def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCopies(value: Double): Self = StObject.set(x, "copies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopiesUndefined: Self = StObject.set(x, "copies", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setDpi(value: Record[String, Double]): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setDuplexMode(value: simplex | shortEdge | longEdge): Self = StObject.set(x, "duplexMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplexModeUndefined: Self = StObject.set(x, "duplexMode", js.undefined)
    
    @scala.inline
    def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setLandscape(value: Boolean): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setMargins(value: Margins): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
    
    @scala.inline
    def setPageRanges(value: js.Array[PageRanges]): Self = StObject.set(x, "pageRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageRangesUndefined: Self = StObject.set(x, "pageRanges", js.undefined)
    
    @scala.inline
    def setPageRangesVarargs(value: PageRanges*): Self = StObject.set(x, "pageRanges", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: String | Size): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    @scala.inline
    def setPagesPerSheet(value: Double): Self = StObject.set(x, "pagesPerSheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPagesPerSheetUndefined: Self = StObject.set(x, "pagesPerSheet", js.undefined)
    
    @scala.inline
    def setPrintBackground(value: Boolean): Self = StObject.set(x, "printBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrintBackgroundUndefined: Self = StObject.set(x, "printBackground", js.undefined)
    
    @scala.inline
    def setScaleFactor(value: Double): Self = StObject.set(x, "scaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactorUndefined: Self = StObject.set(x, "scaleFactor", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
