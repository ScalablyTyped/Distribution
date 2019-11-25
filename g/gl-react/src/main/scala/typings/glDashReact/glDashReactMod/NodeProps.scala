package typings.glDashReact.glDashReactMod

import org.scalablytyped.runtime.StringDictionary
import typings.glDashReact.Anon_Color
import typings.glDashReact.Anon_Dst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProps extends js.Object {
  var backbuffering: js.UndefOr[Boolean] = js.undefined
  var blendFunc: js.UndefOr[Anon_Dst] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var clear: js.UndefOr[Anon_Color] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.undefined
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.undefined
  var shader: ShaderIdentifier | ShaderDefinition
  var sync: js.UndefOr[Boolean] = js.undefined
  var uniforms: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var uniformsOptions: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object NodeProps {
  @scala.inline
  def apply(
    shader: ShaderIdentifier | ShaderDefinition,
    backbuffering: js.UndefOr[Boolean] = js.undefined,
    blendFunc: Anon_Dst = null,
    children: js.Any = null,
    clear: Anon_Color = null,
    height: Int | Double = null,
    ignoreUnusedUniforms: js.Array[String] | Boolean = null,
    onDraw: () => Unit = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    uniforms: StringDictionary[js.Any] = null,
    uniformsOptions: js.Any = null,
    width: Int | Double = null
  ): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    if (!js.isUndefined(backbuffering)) __obj.updateDynamic("backbuffering")(backbuffering.asInstanceOf[js.Any])
    if (blendFunc != null) __obj.updateDynamic("blendFunc")(blendFunc.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (clear != null) __obj.updateDynamic("clear")(clear.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (ignoreUnusedUniforms != null) __obj.updateDynamic("ignoreUnusedUniforms")(ignoreUnusedUniforms.asInstanceOf[js.Any])
    if (onDraw != null) __obj.updateDynamic("onDraw")(js.Any.fromFunction0(onDraw))
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (uniforms != null) __obj.updateDynamic("uniforms")(uniforms.asInstanceOf[js.Any])
    if (uniformsOptions != null) __obj.updateDynamic("uniformsOptions")(uniformsOptions.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
}

