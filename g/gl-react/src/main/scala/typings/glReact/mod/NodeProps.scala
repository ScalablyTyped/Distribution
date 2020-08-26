package typings.glReact.mod

import org.scalablytyped.runtime.StringDictionary
import typings.glReact.anon.Color
import typings.glReact.anon.Dst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeProps extends js.Object {
  var backbuffering: js.UndefOr[Boolean] = js.native
  var blendFunc: js.UndefOr[Dst] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var clear: js.UndefOr[Color] = js.native
  var height: js.UndefOr[Double] = js.native
  var ignoreUnusedUniforms: js.UndefOr[js.Array[String] | Boolean] = js.native
  var onDraw: js.UndefOr[js.Function0[Unit]] = js.native
  var shader: ShaderIdentifier | ShaderDefinition = js.native
  var sync: js.UndefOr[Boolean] = js.native
  var uniforms: js.UndefOr[StringDictionary[js.Any]] = js.native
  var uniformsOptions: js.UndefOr[js.Any] = js.native
  var width: js.UndefOr[Double] = js.native
}

object NodeProps {
  @scala.inline
  def apply(shader: ShaderIdentifier | ShaderDefinition): NodeProps = {
    val __obj = js.Dynamic.literal(shader = shader.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeProps]
  }
  @scala.inline
  implicit class NodePropsOps[Self <: NodeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setShader(value: ShaderIdentifier | ShaderDefinition): Self = this.set("shader", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackbuffering(value: Boolean): Self = this.set("backbuffering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackbuffering: Self = this.set("backbuffering", js.undefined)
    @scala.inline
    def setBlendFunc(value: Dst): Self = this.set("blendFunc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBlendFunc: Self = this.set("blendFunc", js.undefined)
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClear(value: Color): Self = this.set("clear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClear: Self = this.set("clear", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setIgnoreUnusedUniformsVarargs(value: String*): Self = this.set("ignoreUnusedUniforms", js.Array(value :_*))
    @scala.inline
    def setIgnoreUnusedUniforms(value: js.Array[String] | Boolean): Self = this.set("ignoreUnusedUniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreUnusedUniforms: Self = this.set("ignoreUnusedUniforms", js.undefined)
    @scala.inline
    def setOnDraw(value: () => Unit): Self = this.set("onDraw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnDraw: Self = this.set("onDraw", js.undefined)
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
    @scala.inline
    def setUniforms(value: StringDictionary[js.Any]): Self = this.set("uniforms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniforms: Self = this.set("uniforms", js.undefined)
    @scala.inline
    def setUniformsOptions(value: js.Any): Self = this.set("uniformsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUniformsOptions: Self = this.set("uniformsOptions", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

