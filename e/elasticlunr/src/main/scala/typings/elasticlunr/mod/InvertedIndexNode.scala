package typings.elasticlunr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined elasticlunr.elasticlunr.InvertedIndexCharNode & {  df :number,   docs :elasticlunr.elasticlunr.InvertedIndexDocs} */
@js.native
trait InvertedIndexNode extends js.Object {
  var a: js.UndefOr[InvertedIndexNode] = js.native
  var b: js.UndefOr[InvertedIndexNode] = js.native
  var c: js.UndefOr[InvertedIndexNode] = js.native
  var d: js.UndefOr[InvertedIndexNode] = js.native
  var df: Double = js.native
  var docs: InvertedIndexDocs = js.native
  var e: js.UndefOr[InvertedIndexNode] = js.native
  var f: js.UndefOr[InvertedIndexNode] = js.native
  var g: js.UndefOr[InvertedIndexNode] = js.native
  var h: js.UndefOr[InvertedIndexNode] = js.native
  var i: js.UndefOr[InvertedIndexNode] = js.native
  var j: js.UndefOr[InvertedIndexNode] = js.native
  var k: js.UndefOr[InvertedIndexNode] = js.native
  var l: js.UndefOr[InvertedIndexNode] = js.native
  var m: js.UndefOr[InvertedIndexNode] = js.native
  var n: js.UndefOr[InvertedIndexNode] = js.native
  var o: js.UndefOr[InvertedIndexNode] = js.native
  var p: js.UndefOr[InvertedIndexNode] = js.native
  var q: js.UndefOr[InvertedIndexNode] = js.native
  var r: js.UndefOr[InvertedIndexNode] = js.native
  var s: js.UndefOr[InvertedIndexNode] = js.native
  var t: js.UndefOr[InvertedIndexNode] = js.native
  var u: js.UndefOr[InvertedIndexNode] = js.native
  var v: js.UndefOr[InvertedIndexNode] = js.native
  var w: js.UndefOr[InvertedIndexNode] = js.native
  var x: js.UndefOr[InvertedIndexNode] = js.native
  var y: js.UndefOr[InvertedIndexNode] = js.native
  var z: js.UndefOr[InvertedIndexNode] = js.native
}

object InvertedIndexNode {
  @scala.inline
  def apply(df: Double, docs: InvertedIndexDocs): InvertedIndexNode = {
    val __obj = js.Dynamic.literal(df = df.asInstanceOf[js.Any], docs = docs.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvertedIndexNode]
  }
  @scala.inline
  implicit class InvertedIndexNodeOps[Self <: InvertedIndexNode] (val x: Self) extends AnyVal {
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
    def setDf(value: Double): Self = this.set("df", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocs(value: InvertedIndexDocs): Self = this.set("docs", value.asInstanceOf[js.Any])
    @scala.inline
    def setA(value: InvertedIndexNode): Self = this.set("a", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA: Self = this.set("a", js.undefined)
    @scala.inline
    def setB(value: InvertedIndexNode): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    @scala.inline
    def setC(value: InvertedIndexNode): Self = this.set("c", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    @scala.inline
    def setD(value: InvertedIndexNode): Self = this.set("d", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteD: Self = this.set("d", js.undefined)
    @scala.inline
    def setE(value: InvertedIndexNode): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
    @scala.inline
    def setF(value: InvertedIndexNode): Self = this.set("f", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteF: Self = this.set("f", js.undefined)
    @scala.inline
    def setG(value: InvertedIndexNode): Self = this.set("g", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteG: Self = this.set("g", js.undefined)
    @scala.inline
    def setH(value: InvertedIndexNode): Self = this.set("h", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
    @scala.inline
    def setI(value: InvertedIndexNode): Self = this.set("i", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI: Self = this.set("i", js.undefined)
    @scala.inline
    def setJ(value: InvertedIndexNode): Self = this.set("j", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJ: Self = this.set("j", js.undefined)
    @scala.inline
    def setK(value: InvertedIndexNode): Self = this.set("k", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteK: Self = this.set("k", js.undefined)
    @scala.inline
    def setL(value: InvertedIndexNode): Self = this.set("l", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteL: Self = this.set("l", js.undefined)
    @scala.inline
    def setM(value: InvertedIndexNode): Self = this.set("m", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteM: Self = this.set("m", js.undefined)
    @scala.inline
    def setN(value: InvertedIndexNode): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    @scala.inline
    def setO(value: InvertedIndexNode): Self = this.set("o", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteO: Self = this.set("o", js.undefined)
    @scala.inline
    def setP(value: InvertedIndexNode): Self = this.set("p", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    @scala.inline
    def setQ(value: InvertedIndexNode): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
    @scala.inline
    def setR(value: InvertedIndexNode): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    @scala.inline
    def setS(value: InvertedIndexNode): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS: Self = this.set("s", js.undefined)
    @scala.inline
    def setT(value: InvertedIndexNode): Self = this.set("t", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteT: Self = this.set("t", js.undefined)
    @scala.inline
    def setU(value: InvertedIndexNode): Self = this.set("u", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteU: Self = this.set("u", js.undefined)
    @scala.inline
    def setV(value: InvertedIndexNode): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteV: Self = this.set("v", js.undefined)
    @scala.inline
    def setW(value: InvertedIndexNode): Self = this.set("w", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteW: Self = this.set("w", js.undefined)
    @scala.inline
    def setX(value: InvertedIndexNode): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    @scala.inline
    def setY(value: InvertedIndexNode): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
    @scala.inline
    def setZ(value: InvertedIndexNode): Self = this.set("z", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZ: Self = this.set("z", js.undefined)
  }
  
}

