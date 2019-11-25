package typings.dojo.dojox.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.html
  *
  * Styles and defaults used for Drawing stencils and text.
  * This object contains defaults for objects used in Drawing.
  * To change one item's style, use item.attr();
  * To change all these styles, create a copy of this file
  * and point to it in the Drawing properties:
  *
  * <div dojoType="dojox.drawing.Drawing" id="drawing" defaults="MyCustom.defaults"></div>
  * See: Drawing.changeDefaults
  *
  */
@JSName("defaults")
trait defaults_ extends js.Object {
  /**
    * Style for the anchor resize-points
    *
    */
  var anchors: js.Object
  /**
    * Line, arrows, vector and axes will all snap to this angle on mouse up
    * shown angle also reflects the snap
    * currently cannot accept less than 1 degree
    *
    */
  var angleSnap: Double
  /**
    * Size of arrows on vectors.
    * length is in pixels
    * width is actually an angle
    * but is close to pixels in size
    *
    */
  var arrows: js.Object
  /**
    *
    */
  var button: js.Object
  /**
    * Determines whether in draw or edit mode (whether stencils
    * are clickable.  If clickMode is false, the original
    * functionality of silently switching between select modes
    * is enabled.  If clickMode is true, it allows powerpoint-
    * like functionality.  Clickable is used by powerpoint to
    * distinguish when things can be selected and when they can't
    *
    */
  var clickMode: Boolean
  /**
    *
    */
  var clickable: Boolean
  /**
    * current will point to either null or selected
    *
    */
  var current: js.Object
  /**
    * currentHit will point to either hitNorm or hitSelected
    *
    */
  var currentHit: js.Object
  /**
    * Disabled or "locked" or "fade" style of all shapes
    *
    */
  var disabled: js.Object
  /**
    * Highlighted style of all shapes
    * NOT CURRENTLY BEING USED
    *
    */
  var highlighted: js.Object
  /**
    * Highlighted style of a hit area
    *
    */
  var hitHighlighted: js.Object
  /**
    * Normal style of a hit area
    *
    */
  var hitNorm: js.Object
  /**
    * Selected style of a hit area
    *
    */
  var hitSelected: js.Object
  /**
    * If true, the label text color will be the same as the
    * Stencil's line color.
    *
    */
  var labelSameColor: Boolean
  /**
    * Normal style of all shapes
    * will get overridden by
    * above andes styles
    *
    */
  var norm: js.Object
  /**
    * If true, renders a second layer for each Stencil, one
    * acting as a 'hit' object for a wider mouse-click area.
    * It also doubles as a hilight. If true, overrides
    * renderHitLines setting.
    *
    */
  var renderHitLayer: Boolean
  /**
    * If true, renders a second, larger layer for lines to make
    * them more easily clickable.
    *
    */
  var renderHitLines: Boolean
  /**
    * Selected style of all shapes
    * styles not shown will used from
    * norm
    *
    */
  var selected: js.Object
  /**
    * Style of text
    *
    */
  var text: js.Object
  /**
    * Style of disabled text
    *
    */
  var textDisabled: js.Object
  /**
    * These styles apply to the containing
    * text box (edit mode), and not the text itself
    *
    */
  var textMode: js.Object
  /**
    *
    */
  var useSelectedStyle: Boolean
  /**
    *
    */
  var zAngle: Double
  /**
    * If true, draw current object in z-direction.
    *
    */
  var zAxis: Boolean
  /**
    *
    */
  var zAxisEnabled: Boolean
  /**
    * Each shape gets its own copy
    * of these styles so that instances
    * do not change each other's styles
    *
    */
  def copy(): js.Any
}

object defaults_ {
  @scala.inline
  def apply(
    anchors: js.Object,
    angleSnap: Double,
    arrows: js.Object,
    button: js.Object,
    clickMode: Boolean,
    clickable: Boolean,
    copy: () => js.Any,
    current: js.Object,
    currentHit: js.Object,
    disabled: js.Object,
    highlighted: js.Object,
    hitHighlighted: js.Object,
    hitNorm: js.Object,
    hitSelected: js.Object,
    labelSameColor: Boolean,
    norm: js.Object,
    renderHitLayer: Boolean,
    renderHitLines: Boolean,
    selected: js.Object,
    text: js.Object,
    textDisabled: js.Object,
    textMode: js.Object,
    useSelectedStyle: Boolean,
    zAngle: Double,
    zAxis: Boolean,
    zAxisEnabled: Boolean
  ): defaults_ = {
    val __obj = js.Dynamic.literal(anchors = anchors.asInstanceOf[js.Any], angleSnap = angleSnap.asInstanceOf[js.Any], arrows = arrows.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], clickMode = clickMode.asInstanceOf[js.Any], clickable = clickable.asInstanceOf[js.Any], copy = js.Any.fromFunction0(copy), current = current.asInstanceOf[js.Any], currentHit = currentHit.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], hitHighlighted = hitHighlighted.asInstanceOf[js.Any], hitNorm = hitNorm.asInstanceOf[js.Any], hitSelected = hitSelected.asInstanceOf[js.Any], labelSameColor = labelSameColor.asInstanceOf[js.Any], norm = norm.asInstanceOf[js.Any], renderHitLayer = renderHitLayer.asInstanceOf[js.Any], renderHitLines = renderHitLines.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textDisabled = textDisabled.asInstanceOf[js.Any], textMode = textMode.asInstanceOf[js.Any], useSelectedStyle = useSelectedStyle.asInstanceOf[js.Any], zAngle = zAngle.asInstanceOf[js.Any], zAxis = zAxis.asInstanceOf[js.Any], zAxisEnabled = zAxisEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[defaults_]
  }
}

