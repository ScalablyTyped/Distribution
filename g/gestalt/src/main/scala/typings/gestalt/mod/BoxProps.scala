package typings.gestalt.mod

import typings.gestalt.AnonStyle
import typings.gestalt.gestaltStrings.absolute
import typings.gestalt.gestaltStrings.around
import typings.gestalt.gestaltStrings.auto
import typings.gestalt.gestaltStrings.baseline
import typings.gestalt.gestaltStrings.between
import typings.gestalt.gestaltStrings.block
import typings.gestalt.gestaltStrings.blue
import typings.gestalt.gestaltStrings.center
import typings.gestalt.gestaltStrings.circle
import typings.gestalt.gestaltStrings.column
import typings.gestalt.gestaltStrings.darkGray
import typings.gestalt.gestaltStrings.darkWash
import typings.gestalt.gestaltStrings.eggplant
import typings.gestalt.gestaltStrings.end
import typings.gestalt.gestaltStrings.fixed
import typings.gestalt.gestaltStrings.flex
import typings.gestalt.gestaltStrings.gray
import typings.gestalt.gestaltStrings.green
import typings.gestalt.gestaltStrings.grow
import typings.gestalt.gestaltStrings.hidden
import typings.gestalt.gestaltStrings.inlineBlock
import typings.gestalt.gestaltStrings.lightGray
import typings.gestalt.gestaltStrings.lightWash
import typings.gestalt.gestaltStrings.maroon
import typings.gestalt.gestaltStrings.midnight
import typings.gestalt.gestaltStrings.navy
import typings.gestalt.gestaltStrings.none
import typings.gestalt.gestaltStrings.olive
import typings.gestalt.gestaltStrings.orange
import typings.gestalt.gestaltStrings.orchid
import typings.gestalt.gestaltStrings.pill
import typings.gestalt.gestaltStrings.pine
import typings.gestalt.gestaltStrings.purple
import typings.gestalt.gestaltStrings.red
import typings.gestalt.gestaltStrings.relative
import typings.gestalt.gestaltStrings.rounded
import typings.gestalt.gestaltStrings.roundedBottom
import typings.gestalt.gestaltStrings.roundedLeft
import typings.gestalt.gestaltStrings.roundedRight
import typings.gestalt.gestaltStrings.roundedTop
import typings.gestalt.gestaltStrings.row
import typings.gestalt.gestaltStrings.scroll
import typings.gestalt.gestaltStrings.scrollX
import typings.gestalt.gestaltStrings.scrollY
import typings.gestalt.gestaltStrings.shrink
import typings.gestalt.gestaltStrings.square
import typings.gestalt.gestaltStrings.start
import typings.gestalt.gestaltStrings.static
import typings.gestalt.gestaltStrings.stretch
import typings.gestalt.gestaltStrings.transparent
import typings.gestalt.gestaltStrings.transparentDarkGray
import typings.gestalt.gestaltStrings.visible
import typings.gestalt.gestaltStrings.visuallyHidden
import typings.gestalt.gestaltStrings.watermelon
import typings.gestalt.gestaltStrings.white
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoxProps extends js.Object {
  var alignContent: js.UndefOr[start | end | center | between | around | stretch] = js.undefined
  var alignItems: js.UndefOr[start | end | center | baseline | stretch] = js.undefined
  var alignSelf: js.UndefOr[auto | start | end | center | baseline | stretch] = js.undefined
  var bottom: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var color: js.UndefOr[
    blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white
  ] = js.undefined
  var column: js.UndefOr[UnsignedUpTo12] = js.undefined
  var dangerouslySetInlineStyle: js.UndefOr[AnonStyle] = js.undefined
  var direction: js.UndefOr[row | column] = js.undefined
  var display: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var fit: js.UndefOr[Boolean] = js.undefined
  var flex: js.UndefOr[grow | shrink | none] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var justifyContent: js.UndefOr[start | end | center | between | around] = js.undefined
  var left: js.UndefOr[Boolean] = js.undefined
  var lgColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgDirection: js.UndefOr[row | column] = js.undefined
  var lgDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var lgMargin: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginBottom: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginEnd: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginLeft: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginRight: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginStart: js.UndefOr[SignedUpTo12] = js.undefined
  var lgMarginTop: js.UndefOr[SignedUpTo12] = js.undefined
  var lgPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var lgPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var margin: js.UndefOr[SignedUpTo12] = js.undefined
  var marginBottom: js.UndefOr[SignedUpTo12] = js.undefined
  var marginEnd: js.UndefOr[SignedUpTo12] = js.undefined
  var marginLeft: js.UndefOr[SignedUpTo12] = js.undefined
  var marginRight: js.UndefOr[SignedUpTo12] = js.undefined
  var marginStart: js.UndefOr[SignedUpTo12] = js.undefined
  var marginTop: js.UndefOr[SignedUpTo12] = js.undefined
  var maxHeight: js.UndefOr[Double | String] = js.undefined
  var maxWidth: js.UndefOr[Double | String] = js.undefined
  var mdColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdDirection: js.UndefOr[row | column] = js.undefined
  var mdDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var mdMargin: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginBottom: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginEnd: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginLeft: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginRight: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginStart: js.UndefOr[SignedUpTo12] = js.undefined
  var mdMarginTop: js.UndefOr[SignedUpTo12] = js.undefined
  var mdPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var mdPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var minHeight: js.UndefOr[Double | String] = js.undefined
  var minWidth: js.UndefOr[Double | String] = js.undefined
  var overflow: js.UndefOr[visible | hidden | scroll | scrollX | scrollY | auto] = js.undefined
  var padding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var paddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var paddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var position: js.UndefOr[static | absolute | relative | fixed] = js.undefined
  var right: js.UndefOr[Boolean] = js.undefined
  var shape: js.UndefOr[
    square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight
  ] = js.undefined
  var smColumn: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smDirection: js.UndefOr[row | column] = js.undefined
  var smDisplay: js.UndefOr[none | flex | block | inlineBlock | visuallyHidden] = js.undefined
  var smMargin: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginBottom: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginEnd: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginLeft: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginRight: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginStart: js.UndefOr[SignedUpTo12] = js.undefined
  var smMarginTop: js.UndefOr[SignedUpTo12] = js.undefined
  var smPadding: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smPaddingX: js.UndefOr[UnsignedUpTo12] = js.undefined
  var smPaddingY: js.UndefOr[UnsignedUpTo12] = js.undefined
  var top: js.UndefOr[Boolean] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
  var wrap: js.UndefOr[Boolean] = js.undefined
}

object BoxProps {
  @scala.inline
  def apply(
    alignContent: start | end | center | between | around | stretch = null,
    alignItems: start | end | center | baseline | stretch = null,
    alignSelf: auto | start | end | center | baseline | stretch = null,
    bottom: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    color: blue | darkGray | darkWash | eggplant | gray | green | lightGray | lightWash | maroon | midnight | navy | olive | orange | orchid | pine | purple | red | transparent | transparentDarkGray | watermelon | white = null,
    column: UnsignedUpTo12 = null,
    dangerouslySetInlineStyle: AnonStyle = null,
    direction: row | column = null,
    display: none | flex | block | inlineBlock | visuallyHidden = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    flex: grow | shrink | none = null,
    height: Double | String = null,
    justifyContent: start | end | center | between | around = null,
    left: js.UndefOr[Boolean] = js.undefined,
    lgColumn: UnsignedUpTo12 = null,
    lgDirection: row | column = null,
    lgDisplay: none | flex | block | inlineBlock | visuallyHidden = null,
    lgMargin: SignedUpTo12 = null,
    lgMarginBottom: SignedUpTo12 = null,
    lgMarginEnd: SignedUpTo12 = null,
    lgMarginLeft: SignedUpTo12 = null,
    lgMarginRight: SignedUpTo12 = null,
    lgMarginStart: SignedUpTo12 = null,
    lgMarginTop: SignedUpTo12 = null,
    lgPadding: UnsignedUpTo12 = null,
    lgPaddingX: UnsignedUpTo12 = null,
    lgPaddingY: UnsignedUpTo12 = null,
    margin: SignedUpTo12 = null,
    marginBottom: SignedUpTo12 = null,
    marginEnd: SignedUpTo12 = null,
    marginLeft: SignedUpTo12 = null,
    marginRight: SignedUpTo12 = null,
    marginStart: SignedUpTo12 = null,
    marginTop: SignedUpTo12 = null,
    maxHeight: Double | String = null,
    maxWidth: Double | String = null,
    mdColumn: UnsignedUpTo12 = null,
    mdDirection: row | column = null,
    mdDisplay: none | flex | block | inlineBlock | visuallyHidden = null,
    mdMargin: SignedUpTo12 = null,
    mdMarginBottom: SignedUpTo12 = null,
    mdMarginEnd: SignedUpTo12 = null,
    mdMarginLeft: SignedUpTo12 = null,
    mdMarginRight: SignedUpTo12 = null,
    mdMarginStart: SignedUpTo12 = null,
    mdMarginTop: SignedUpTo12 = null,
    mdPadding: UnsignedUpTo12 = null,
    mdPaddingX: UnsignedUpTo12 = null,
    mdPaddingY: UnsignedUpTo12 = null,
    minHeight: Double | String = null,
    minWidth: Double | String = null,
    overflow: visible | hidden | scroll | scrollX | scrollY | auto = null,
    padding: UnsignedUpTo12 = null,
    paddingX: UnsignedUpTo12 = null,
    paddingY: UnsignedUpTo12 = null,
    position: static | absolute | relative | fixed = null,
    right: js.UndefOr[Boolean] = js.undefined,
    shape: square | rounded | pill | circle | roundedTop | roundedBottom | roundedLeft | roundedRight = null,
    smColumn: UnsignedUpTo12 = null,
    smDirection: row | column = null,
    smDisplay: none | flex | block | inlineBlock | visuallyHidden = null,
    smMargin: SignedUpTo12 = null,
    smMarginBottom: SignedUpTo12 = null,
    smMarginEnd: SignedUpTo12 = null,
    smMarginLeft: SignedUpTo12 = null,
    smMarginRight: SignedUpTo12 = null,
    smMarginStart: SignedUpTo12 = null,
    smMarginTop: SignedUpTo12 = null,
    smPadding: UnsignedUpTo12 = null,
    smPaddingX: UnsignedUpTo12 = null,
    smPaddingY: UnsignedUpTo12 = null,
    top: js.UndefOr[Boolean] = js.undefined,
    width: Double | String = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): BoxProps = {
    val __obj = js.Dynamic.literal()
    if (alignContent != null) __obj.updateDynamic("alignContent")(alignContent.asInstanceOf[js.Any])
    if (alignItems != null) __obj.updateDynamic("alignItems")(alignItems.asInstanceOf[js.Any])
    if (alignSelf != null) __obj.updateDynamic("alignSelf")(alignSelf.asInstanceOf[js.Any])
    if (!js.isUndefined(bottom)) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (dangerouslySetInlineStyle != null) __obj.updateDynamic("dangerouslySetInlineStyle")(dangerouslySetInlineStyle.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (flex != null) __obj.updateDynamic("flex")(flex.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (justifyContent != null) __obj.updateDynamic("justifyContent")(justifyContent.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (lgColumn != null) __obj.updateDynamic("lgColumn")(lgColumn.asInstanceOf[js.Any])
    if (lgDirection != null) __obj.updateDynamic("lgDirection")(lgDirection.asInstanceOf[js.Any])
    if (lgDisplay != null) __obj.updateDynamic("lgDisplay")(lgDisplay.asInstanceOf[js.Any])
    if (lgMargin != null) __obj.updateDynamic("lgMargin")(lgMargin.asInstanceOf[js.Any])
    if (lgMarginBottom != null) __obj.updateDynamic("lgMarginBottom")(lgMarginBottom.asInstanceOf[js.Any])
    if (lgMarginEnd != null) __obj.updateDynamic("lgMarginEnd")(lgMarginEnd.asInstanceOf[js.Any])
    if (lgMarginLeft != null) __obj.updateDynamic("lgMarginLeft")(lgMarginLeft.asInstanceOf[js.Any])
    if (lgMarginRight != null) __obj.updateDynamic("lgMarginRight")(lgMarginRight.asInstanceOf[js.Any])
    if (lgMarginStart != null) __obj.updateDynamic("lgMarginStart")(lgMarginStart.asInstanceOf[js.Any])
    if (lgMarginTop != null) __obj.updateDynamic("lgMarginTop")(lgMarginTop.asInstanceOf[js.Any])
    if (lgPadding != null) __obj.updateDynamic("lgPadding")(lgPadding.asInstanceOf[js.Any])
    if (lgPaddingX != null) __obj.updateDynamic("lgPaddingX")(lgPaddingX.asInstanceOf[js.Any])
    if (lgPaddingY != null) __obj.updateDynamic("lgPaddingY")(lgPaddingY.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (marginBottom != null) __obj.updateDynamic("marginBottom")(marginBottom.asInstanceOf[js.Any])
    if (marginEnd != null) __obj.updateDynamic("marginEnd")(marginEnd.asInstanceOf[js.Any])
    if (marginLeft != null) __obj.updateDynamic("marginLeft")(marginLeft.asInstanceOf[js.Any])
    if (marginRight != null) __obj.updateDynamic("marginRight")(marginRight.asInstanceOf[js.Any])
    if (marginStart != null) __obj.updateDynamic("marginStart")(marginStart.asInstanceOf[js.Any])
    if (marginTop != null) __obj.updateDynamic("marginTop")(marginTop.asInstanceOf[js.Any])
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (mdColumn != null) __obj.updateDynamic("mdColumn")(mdColumn.asInstanceOf[js.Any])
    if (mdDirection != null) __obj.updateDynamic("mdDirection")(mdDirection.asInstanceOf[js.Any])
    if (mdDisplay != null) __obj.updateDynamic("mdDisplay")(mdDisplay.asInstanceOf[js.Any])
    if (mdMargin != null) __obj.updateDynamic("mdMargin")(mdMargin.asInstanceOf[js.Any])
    if (mdMarginBottom != null) __obj.updateDynamic("mdMarginBottom")(mdMarginBottom.asInstanceOf[js.Any])
    if (mdMarginEnd != null) __obj.updateDynamic("mdMarginEnd")(mdMarginEnd.asInstanceOf[js.Any])
    if (mdMarginLeft != null) __obj.updateDynamic("mdMarginLeft")(mdMarginLeft.asInstanceOf[js.Any])
    if (mdMarginRight != null) __obj.updateDynamic("mdMarginRight")(mdMarginRight.asInstanceOf[js.Any])
    if (mdMarginStart != null) __obj.updateDynamic("mdMarginStart")(mdMarginStart.asInstanceOf[js.Any])
    if (mdMarginTop != null) __obj.updateDynamic("mdMarginTop")(mdMarginTop.asInstanceOf[js.Any])
    if (mdPadding != null) __obj.updateDynamic("mdPadding")(mdPadding.asInstanceOf[js.Any])
    if (mdPaddingX != null) __obj.updateDynamic("mdPaddingX")(mdPaddingX.asInstanceOf[js.Any])
    if (mdPaddingY != null) __obj.updateDynamic("mdPaddingY")(mdPaddingY.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(right)) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (smColumn != null) __obj.updateDynamic("smColumn")(smColumn.asInstanceOf[js.Any])
    if (smDirection != null) __obj.updateDynamic("smDirection")(smDirection.asInstanceOf[js.Any])
    if (smDisplay != null) __obj.updateDynamic("smDisplay")(smDisplay.asInstanceOf[js.Any])
    if (smMargin != null) __obj.updateDynamic("smMargin")(smMargin.asInstanceOf[js.Any])
    if (smMarginBottom != null) __obj.updateDynamic("smMarginBottom")(smMarginBottom.asInstanceOf[js.Any])
    if (smMarginEnd != null) __obj.updateDynamic("smMarginEnd")(smMarginEnd.asInstanceOf[js.Any])
    if (smMarginLeft != null) __obj.updateDynamic("smMarginLeft")(smMarginLeft.asInstanceOf[js.Any])
    if (smMarginRight != null) __obj.updateDynamic("smMarginRight")(smMarginRight.asInstanceOf[js.Any])
    if (smMarginStart != null) __obj.updateDynamic("smMarginStart")(smMarginStart.asInstanceOf[js.Any])
    if (smMarginTop != null) __obj.updateDynamic("smMarginTop")(smMarginTop.asInstanceOf[js.Any])
    if (smPadding != null) __obj.updateDynamic("smPadding")(smPadding.asInstanceOf[js.Any])
    if (smPaddingX != null) __obj.updateDynamic("smPaddingX")(smPaddingX.asInstanceOf[js.Any])
    if (smPaddingY != null) __obj.updateDynamic("smPaddingY")(smPaddingY.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxProps]
  }
}

