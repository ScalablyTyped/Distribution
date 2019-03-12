package typings
package glDashReactLib.glDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var backbuffering: js.UndefOr[scala.Boolean] = js.undefined
  var blendFunc: js.UndefOr[glDashReactLib.Anon_Dst] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var clear: js.UndefOr[glDashReactLib.Anon_Color] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var ignoreUnusedUniforms: js.UndefOr[js.Array[java.lang.String] | scala.Boolean] = js.undefined
  var onDraw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var shader: ShaderIdentifier | ShaderDefinition
  var sync: js.UndefOr[scala.Boolean] = js.undefined
  var uniforms: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var uniformsOptions: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object NodeProps {
  @scala.inline
  def apply(
    shader: ShaderIdentifier | ShaderDefinition,
    backbuffering: js.UndefOr[scala.Boolean] = js.undefined,
    blendFunc: glDashReactLib.Anon_Dst = null,
    children: js.Any = null,
    clear: glDashReactLib.Anon_Color = null,
    height: scala.Int | scala.Double = null,
    ignoreUnusedUniforms: js.Array[java.lang.String] | scala.Boolean = null,
    onDraw: () => scala.Unit = null,
    sync: js.UndefOr[scala.Boolean] = js.undefined,
    uniforms: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    uniformsOptions: js.Any = null,
    width: scala.Int | scala.Double = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    if (!js.isUndefined(backbuffering)) __obj.updateDynamic("backbuffering")(backbuffering)
    if (blendFunc != null) __obj.updateDynamic("blendFunc")(blendFunc)
    if (children != null) __obj.updateDynamic("children")(children)
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreUnusedUniforms != null) __obj.updateDynamic("ignoreUnusedUniforms")(ignoreUnusedUniforms.asInstanceOf[js.Any])
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction0(onDraw))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms)
    if (uniformsOptions != null) __obj.updateDynamic("uniformsOptions")(uniformsOptions)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
}

