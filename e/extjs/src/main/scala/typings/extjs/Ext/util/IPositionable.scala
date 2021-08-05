package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositionable
  extends StObject
     with IBase {
  
  /** [Method] Aligns the element with another element relative to the specified anchor points
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var alignTo: js.UndefOr[
    js.Function4[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Anchors an element to another element and realigns it when the window is resized
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @param monitorScroll Boolean/Number True to monitor body scroll and reposition. If this parameter is a number, it is used as the buffer delay in milliseconds.
    * @param callback Function The function to call after the animation finishes
    * @returns Ext.util.Positionable this
    */
  var anchorTo: js.UndefOr[
    js.Function6[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      /* animate */ js.UndefOr[js.Any], 
      /* monitorScroll */ js.UndefOr[js.Any], 
      /* callback */ js.UndefOr[js.Any], 
      this.type
    ]
  ] = js.undefined
  
  /** [Method] Calculates the new x y position to move this Positionable into a constrain region
    * @param constrainTo String/HTMLElement/Ext.Element/Ext.util.Region The Element or Region into which this Component is to be constrained. Defaults to the element into which this Positionable was rendered, or this Component's {@link Ext.Component.constrainTo.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to coerce into constraints instead of using this Positionable's current position.
    * @param local Boolean The proposedPosition is local (relative to floatParent if a floating Component)
    * @param proposedSize Number[] A proposed [width, height] size to use when calculating constraints instead of using this Positionable's current size.
    * @returns Number[] If the element needs to be translated, the new [X, Y] position within constraints if possible, giving priority to keeping the top and left edge in the constrain region. Otherwise, false.
    */
  var calculateConstrainedPosition: js.UndefOr[
    js.Function4[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[Array], 
      /* local */ js.UndefOr[Boolean], 
      /* proposedSize */ js.UndefOr[Array], 
      Array
    ]
  ] = js.undefined
  
  /** [Method] Gets the x y coordinates to align this element with another element
    * @param element Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or id of the element to align to.
    * @param position String The position to align to
    * @param offsets Number[] Offset the positioning by [x, y]
    * @returns Number[] [x, y]
    */
  var getAlignToXY: js.UndefOr[
    js.Function3[
      /* element */ js.UndefOr[js.Any], 
      /* position */ js.UndefOr[String], 
      /* offsets */ js.UndefOr[Array], 
      Array
    ]
  ] = js.undefined
  
  /** [Method] Gets the x y coordinates specified by the anchor position on the element
    * @param anchor String The specified anchor position. See alignTo for details on supported anchor positions.
    * @param local Boolean True to get the local (element top/left-relative) anchor position instead of page coordinates
    * @param size Object An object containing the size to use for calculating anchor position {width: (target width), height: (target height)} (defaults to the element's current size)
    * @returns Number[] [x, y] An array containing the element's x and y coordinates
    */
  var getAnchorXY: js.UndefOr[
    js.Function3[
      /* anchor */ js.UndefOr[String], 
      /* local */ js.UndefOr[Boolean], 
      /* size */ js.UndefOr[js.Any], 
      Array
    ]
  ] = js.undefined
  
  /** [Method] Return an object defining the area of this Element which can be passed to setBox to set another Element s size locati
    * @param contentBox Boolean If true a box for the content of the element is returned.
    * @param local Boolean If true the element's left and top relative to its offsetParent are returned instead of page x/y.
    * @returns Object box An object in the format: {  x: &lt;Element's X position&gt;,  y: &lt;Element's Y position&gt;,  left: &lt;Element's X position (an alias for x)&gt;,  top: &lt;Element's Y position (an alias for y)&gt;,  width: &lt;Element's width&gt;,  height: &lt;Element's height&gt;,  bottom: &lt;Element's lower bound&gt;,  right: &lt;Element's rightmost bound&gt; }  The returned object may also be addressed as an Array where index 0 contains the X position and index 1 contains the Y position. The result may also be used for setXY
    */
  var getBox: js.UndefOr[
    js.Function2[/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean], js.Any]
  ] = js.undefined
  
  /** [Method] Returns the X Y vector by which this Positionable s element must be translated to make a best attempt to constrain
    * @param constrainTo Ext.util.Positionable/HTMLElement/String/Ext.util.Region The Positionable, HTMLElement, element id, or Region into which the element is to be constrained.
    * @param proposedPosition Number[] A proposed [X, Y] position to test for validity and to produce a vector for instead of using the element's current position
    * @param proposedSize Number[] A proposed [width, height] size to constrain instead of using the element's current size
    * @returns Number[]/Boolean If the element needs to be translated, an [X, Y] vector by which this element must be translated. Otherwise, false.
    */
  var getConstrainVector: js.UndefOr[
    js.Function3[
      /* constrainTo */ js.UndefOr[js.Any], 
      /* proposedPosition */ js.UndefOr[Array], 
      /* proposedSize */ js.UndefOr[Array], 
      js.Any
    ]
  ] = js.undefined
  
  /** [Method] Returns the x coordinate of this element reletive to its offsetParent
    * @returns Number The local x coordinate
    */
  var getLocalX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the x and y coordinates of this element relative to its offsetParent
    * @returns Number[] The local XY position of the element
    */
  var getLocalXY: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Returns the y coordinate of this element reletive to its offsetParent
    * @returns Number The local y coordinate
    */
  var getLocalY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Returns the offsets of this element from the passed element
    * @param offsetsTo Ext.util.Positionable/HTMLElement/String The Positionable, HTMLElement, or element id to get get the offsets from.
    * @returns Number[] The XY page offsets (e.g. [100, -200])
    */
  var getOffsetsTo: js.UndefOr[js.Function1[/* offsetsTo */ js.UndefOr[js.Any], Array]] = js.undefined
  
  /** [Method] Returns a region object that defines the area of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" properties.
    */
  var getRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  
  /** [Method] Returns the content region of this element
    * @returns Ext.util.Region A Region containing "top, left, bottom, right" member data.
    */
  var getViewRegion: js.UndefOr[js.Function0[IRegion]] = js.undefined
  
  /** [Method] Gets the current X position of the DOM element based on page coordinates
    * @returns Number The X position of the element
    */
  var getX: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Gets the current position of the DOM element based on page coordinates
    * @returns Number[] The XY position of the element
    */
  var getXY: js.UndefOr[js.Function0[Array]] = js.undefined
  
  /** [Method] Gets the current Y position of the DOM element based on page coordinates
    * @returns Number The Y position of the element
    */
  var getY: js.UndefOr[js.Function0[Double]] = js.undefined
  
  /** [Method] Move the element relative to its current position
    * @param direction String Possible values are:  "l" (or "left") "r" (or "right") "t" (or "top", or "up") "b" (or "bottom", or "down")
    * @param distance Number How far to move the element in pixels
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    */
  var move: js.UndefOr[
    js.Function3[
      /* direction */ js.UndefOr[String], 
      /* distance */ js.UndefOr[Double], 
      /* animate */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** [Method] Remove any anchor to this element
    * @returns Ext.util.Positionable this
    */
  var removeAnchor: js.UndefOr[js.Function0[this.type]] = js.undefined
  
  /** [Method] Sets the element s box
    * @param box Object The box to fill {x, y, width, height}
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setBox: js.UndefOr[
    js.Function2[/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Sets the local x coordinate of this element using CSS style
    * @param x Number The x coordinate. A value of null sets the left style to 'auto'.
    * @returns Ext.util.Positionable this
    */
  var setLocalX: js.UndefOr[js.Function1[/* x */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Sets the local x and y coordinates of this element using CSS style
    * @param x Number/Array The x coordinate or an array containing [x, y]. A value of null sets the left style to 'auto'
    * @param y Number The y coordinate, required if x is not an array. A value of null sets the top style to 'auto'
    * @returns Ext.util.Positionable this
    */
  var setLocalXY: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Sets the local y coordinate of this element using CSS style
    * @param y Number The y coordinate. A value of null sets the top style to 'auto'.
    * @returns Ext.util.Positionable this
    */
  var setLocalY: js.UndefOr[js.Function1[/* y */ js.UndefOr[Double], this.type]] = js.undefined
  
  /** [Method] Sets the element s position and size to the specified region
    * @param region Ext.util.Region The region to fill
    * @param animate Boolean/Object true for the default animation or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setRegion: js.UndefOr[
    js.Function2[/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Sets the X position of the DOM element based on page coordinates
    * @param The Number X position
    * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setX: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Sets the position of the DOM element in page coordinates
    * @param pos Number[] Contains X &amp; Y [x, y] values for new position (coordinates are page-based)
    * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setXY: js.UndefOr[
    js.Function2[/* pos */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Sets the Y position of the DOM element based on page coordinates
    * @param The Number Y position
    * @param animate Boolean/Object True for the default animation, or a standard Element animation config object
    * @returns Ext.util.Positionable this
    */
  var setY: js.UndefOr[
    js.Function2[/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any], this.type]
  ] = js.undefined
  
  /** [Method] Translates the passed page coordinates into left top css values for the element
    * @param x Number/Array The page x or an array containing [x, y]
    * @param y Number The page y, required if x is not an array
    * @returns Object An object with left and top properties. e.g. {left: (value), top: (value)}
    */
  var translatePoints: js.UndefOr[js.Function2[/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double], js.Any]] = js.undefined
}
object IPositionable {
  
  inline def apply(): IPositionable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPositionable]
  }
  
  extension [Self <: IPositionable](x: Self) {
    
    inline def setAlignTo(
      value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any]) => IPositionable
    ): Self = StObject.set(x, "alignTo", js.Any.fromFunction4(value))
    
    inline def setAlignToUndefined: Self = StObject.set(x, "alignTo", js.undefined)
    
    inline def setAnchorTo(
      value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any], /* monitorScroll */ js.UndefOr[js.Any], /* callback */ js.UndefOr[js.Any]) => IPositionable
    ): Self = StObject.set(x, "anchorTo", js.Any.fromFunction6(value))
    
    inline def setAnchorToUndefined: Self = StObject.set(x, "anchorTo", js.undefined)
    
    inline def setCalculateConstrainedPosition(
      value: (/* constrainTo */ js.UndefOr[js.Any], /* proposedPosition */ js.UndefOr[Array], /* local */ js.UndefOr[Boolean], /* proposedSize */ js.UndefOr[Array]) => Array
    ): Self = StObject.set(x, "calculateConstrainedPosition", js.Any.fromFunction4(value))
    
    inline def setCalculateConstrainedPositionUndefined: Self = StObject.set(x, "calculateConstrainedPosition", js.undefined)
    
    inline def setGetAlignToXY(
      value: (/* element */ js.UndefOr[js.Any], /* position */ js.UndefOr[String], /* offsets */ js.UndefOr[Array]) => Array
    ): Self = StObject.set(x, "getAlignToXY", js.Any.fromFunction3(value))
    
    inline def setGetAlignToXYUndefined: Self = StObject.set(x, "getAlignToXY", js.undefined)
    
    inline def setGetAnchorXY(
      value: (/* anchor */ js.UndefOr[String], /* local */ js.UndefOr[Boolean], /* size */ js.UndefOr[js.Any]) => Array
    ): Self = StObject.set(x, "getAnchorXY", js.Any.fromFunction3(value))
    
    inline def setGetAnchorXYUndefined: Self = StObject.set(x, "getAnchorXY", js.undefined)
    
    inline def setGetBox(value: (/* contentBox */ js.UndefOr[Boolean], /* local */ js.UndefOr[Boolean]) => js.Any): Self = StObject.set(x, "getBox", js.Any.fromFunction2(value))
    
    inline def setGetBoxUndefined: Self = StObject.set(x, "getBox", js.undefined)
    
    inline def setGetConstrainVector(
      value: (/* constrainTo */ js.UndefOr[js.Any], /* proposedPosition */ js.UndefOr[Array], /* proposedSize */ js.UndefOr[Array]) => js.Any
    ): Self = StObject.set(x, "getConstrainVector", js.Any.fromFunction3(value))
    
    inline def setGetConstrainVectorUndefined: Self = StObject.set(x, "getConstrainVector", js.undefined)
    
    inline def setGetLocalX(value: () => Double): Self = StObject.set(x, "getLocalX", js.Any.fromFunction0(value))
    
    inline def setGetLocalXUndefined: Self = StObject.set(x, "getLocalX", js.undefined)
    
    inline def setGetLocalXY(value: () => Array): Self = StObject.set(x, "getLocalXY", js.Any.fromFunction0(value))
    
    inline def setGetLocalXYUndefined: Self = StObject.set(x, "getLocalXY", js.undefined)
    
    inline def setGetLocalY(value: () => Double): Self = StObject.set(x, "getLocalY", js.Any.fromFunction0(value))
    
    inline def setGetLocalYUndefined: Self = StObject.set(x, "getLocalY", js.undefined)
    
    inline def setGetOffsetsTo(value: /* offsetsTo */ js.UndefOr[js.Any] => Array): Self = StObject.set(x, "getOffsetsTo", js.Any.fromFunction1(value))
    
    inline def setGetOffsetsToUndefined: Self = StObject.set(x, "getOffsetsTo", js.undefined)
    
    inline def setGetRegion(value: () => IRegion): Self = StObject.set(x, "getRegion", js.Any.fromFunction0(value))
    
    inline def setGetRegionUndefined: Self = StObject.set(x, "getRegion", js.undefined)
    
    inline def setGetViewRegion(value: () => IRegion): Self = StObject.set(x, "getViewRegion", js.Any.fromFunction0(value))
    
    inline def setGetViewRegionUndefined: Self = StObject.set(x, "getViewRegion", js.undefined)
    
    inline def setGetX(value: () => Double): Self = StObject.set(x, "getX", js.Any.fromFunction0(value))
    
    inline def setGetXUndefined: Self = StObject.set(x, "getX", js.undefined)
    
    inline def setGetXY(value: () => Array): Self = StObject.set(x, "getXY", js.Any.fromFunction0(value))
    
    inline def setGetXYUndefined: Self = StObject.set(x, "getXY", js.undefined)
    
    inline def setGetY(value: () => Double): Self = StObject.set(x, "getY", js.Any.fromFunction0(value))
    
    inline def setGetYUndefined: Self = StObject.set(x, "getY", js.undefined)
    
    inline def setMove(
      value: (/* direction */ js.UndefOr[String], /* distance */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setRemoveAnchor(value: () => IPositionable): Self = StObject.set(x, "removeAnchor", js.Any.fromFunction0(value))
    
    inline def setRemoveAnchorUndefined: Self = StObject.set(x, "removeAnchor", js.undefined)
    
    inline def setSetBox(value: (/* box */ js.UndefOr[js.Any], /* animate */ js.UndefOr[js.Any]) => IPositionable): Self = StObject.set(x, "setBox", js.Any.fromFunction2(value))
    
    inline def setSetBoxUndefined: Self = StObject.set(x, "setBox", js.undefined)
    
    inline def setSetLocalX(value: /* x */ js.UndefOr[Double] => IPositionable): Self = StObject.set(x, "setLocalX", js.Any.fromFunction1(value))
    
    inline def setSetLocalXUndefined: Self = StObject.set(x, "setLocalX", js.undefined)
    
    inline def setSetLocalXY(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => IPositionable): Self = StObject.set(x, "setLocalXY", js.Any.fromFunction2(value))
    
    inline def setSetLocalXYUndefined: Self = StObject.set(x, "setLocalXY", js.undefined)
    
    inline def setSetLocalY(value: /* y */ js.UndefOr[Double] => IPositionable): Self = StObject.set(x, "setLocalY", js.Any.fromFunction1(value))
    
    inline def setSetLocalYUndefined: Self = StObject.set(x, "setLocalY", js.undefined)
    
    inline def setSetRegion(value: (/* region */ js.UndefOr[IRegion], /* animate */ js.UndefOr[js.Any]) => IPositionable): Self = StObject.set(x, "setRegion", js.Any.fromFunction2(value))
    
    inline def setSetRegionUndefined: Self = StObject.set(x, "setRegion", js.undefined)
    
    inline def setSetX(value: (/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IPositionable): Self = StObject.set(x, "setX", js.Any.fromFunction2(value))
    
    inline def setSetXUndefined: Self = StObject.set(x, "setX", js.undefined)
    
    inline def setSetXY(value: (/* pos */ js.UndefOr[Array], /* animate */ js.UndefOr[js.Any]) => IPositionable): Self = StObject.set(x, "setXY", js.Any.fromFunction2(value))
    
    inline def setSetXYUndefined: Self = StObject.set(x, "setXY", js.undefined)
    
    inline def setSetY(value: (/* The */ js.UndefOr[Double], /* animate */ js.UndefOr[js.Any]) => IPositionable): Self = StObject.set(x, "setY", js.Any.fromFunction2(value))
    
    inline def setSetYUndefined: Self = StObject.set(x, "setY", js.undefined)
    
    inline def setTranslatePoints(value: (/* x */ js.UndefOr[js.Any], /* y */ js.UndefOr[Double]) => js.Any): Self = StObject.set(x, "translatePoints", js.Any.fromFunction2(value))
    
    inline def setTranslatePointsUndefined: Self = StObject.set(x, "translatePoints", js.undefined)
  }
}
