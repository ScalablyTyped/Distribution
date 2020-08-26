package typings.figma.mod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorNetwork extends js.Object {
  val regions: js.UndefOr[js.Array[VectorRegion]] = js.native
  val segments: js.Array[VectorSegment] = js.native
  val vertices: js.Array[VectorVertex] = js.native
}

object VectorNetwork {
  @scala.inline
  def apply(segments: js.Array[VectorSegment], vertices: js.Array[VectorVertex]): VectorNetwork = {
    val __obj = js.Dynamic.literal(segments = segments.asInstanceOf[js.Any], vertices = vertices.asInstanceOf[js.Any])
    __obj.asInstanceOf[VectorNetwork]
  }
  @scala.inline
  implicit class VectorNetworkOps[Self <: VectorNetwork] (val x: Self) extends AnyVal {
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
    def setSegmentsVarargs(value: VectorSegment*): Self = this.set("segments", js.Array(value :_*))
    @scala.inline
    def setSegments(value: js.Array[VectorSegment]): Self = this.set("segments", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerticesVarargs(value: VectorVertex*): Self = this.set("vertices", js.Array(value :_*))
    @scala.inline
    def setVertices(value: js.Array[VectorVertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionsVarargs(value: VectorRegion*): Self = this.set("regions", js.Array(value :_*))
    @scala.inline
    def setRegions(value: js.Array[VectorRegion]): Self = this.set("regions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegions: Self = this.set("regions", js.undefined)
  }
  
}

