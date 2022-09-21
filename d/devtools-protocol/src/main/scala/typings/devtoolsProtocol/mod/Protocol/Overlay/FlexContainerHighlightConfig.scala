package typings.devtoolsProtocol.mod.Protocol.Overlay

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexContainerHighlightConfig extends StObject {
  
  /**
    * Style of empty space caused by columns gaps (gap/column-gap).
    */
  var columnGapSpace: js.UndefOr[BoxStyle] = js.undefined
  
  /**
    * The style of the container border
    */
  var containerBorder: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * Style of the self-alignment line (align-items).
    */
  var crossAlignment: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * Style of content-distribution space on the cross axis (align-content).
    */
  var crossDistributedSpace: js.UndefOr[BoxStyle] = js.undefined
  
  /**
    * The style of the separator between items
    */
  var itemSeparator: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * The style of the separator between lines
    */
  var lineSeparator: js.UndefOr[LineStyle] = js.undefined
  
  /**
    * Style of content-distribution space on the main axis (justify-content).
    */
  var mainDistributedSpace: js.UndefOr[BoxStyle] = js.undefined
  
  /**
    * Style of empty space caused by row gaps (gap/row-gap).
    */
  var rowGapSpace: js.UndefOr[BoxStyle] = js.undefined
}
object FlexContainerHighlightConfig {
  
  inline def apply(): FlexContainerHighlightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlexContainerHighlightConfig]
  }
  
  extension [Self <: FlexContainerHighlightConfig](x: Self) {
    
    inline def setColumnGapSpace(value: BoxStyle): Self = StObject.set(x, "columnGapSpace", value.asInstanceOf[js.Any])
    
    inline def setColumnGapSpaceUndefined: Self = StObject.set(x, "columnGapSpace", js.undefined)
    
    inline def setContainerBorder(value: LineStyle): Self = StObject.set(x, "containerBorder", value.asInstanceOf[js.Any])
    
    inline def setContainerBorderUndefined: Self = StObject.set(x, "containerBorder", js.undefined)
    
    inline def setCrossAlignment(value: LineStyle): Self = StObject.set(x, "crossAlignment", value.asInstanceOf[js.Any])
    
    inline def setCrossAlignmentUndefined: Self = StObject.set(x, "crossAlignment", js.undefined)
    
    inline def setCrossDistributedSpace(value: BoxStyle): Self = StObject.set(x, "crossDistributedSpace", value.asInstanceOf[js.Any])
    
    inline def setCrossDistributedSpaceUndefined: Self = StObject.set(x, "crossDistributedSpace", js.undefined)
    
    inline def setItemSeparator(value: LineStyle): Self = StObject.set(x, "itemSeparator", value.asInstanceOf[js.Any])
    
    inline def setItemSeparatorUndefined: Self = StObject.set(x, "itemSeparator", js.undefined)
    
    inline def setLineSeparator(value: LineStyle): Self = StObject.set(x, "lineSeparator", value.asInstanceOf[js.Any])
    
    inline def setLineSeparatorUndefined: Self = StObject.set(x, "lineSeparator", js.undefined)
    
    inline def setMainDistributedSpace(value: BoxStyle): Self = StObject.set(x, "mainDistributedSpace", value.asInstanceOf[js.Any])
    
    inline def setMainDistributedSpaceUndefined: Self = StObject.set(x, "mainDistributedSpace", js.undefined)
    
    inline def setRowGapSpace(value: BoxStyle): Self = StObject.set(x, "rowGapSpace", value.asInstanceOf[js.Any])
    
    inline def setRowGapSpaceUndefined: Self = StObject.set(x, "rowGapSpace", js.undefined)
  }
}
