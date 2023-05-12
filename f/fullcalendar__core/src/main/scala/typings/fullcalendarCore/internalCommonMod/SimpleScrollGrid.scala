package typings.fullcalendarCore.internalCommonMod

import typings.fullcalendarCore.anon.ForceYScrollbars
import typings.preact.mod.VNode
import typings.preact.mod.createElement.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleScrollGrid extends BaseComponent[SimpleScrollGridProps, SimpleScrollGridState] {
  
  def _handleScrollerEl(scrollerEl: Null, key: String): Unit = js.native
  def _handleScrollerEl(scrollerEl: HTMLElement, key: String): Unit = js.native
  
  @JSName("componentDidMount")
  def componentDidMount_MSimpleScrollGrid(): Unit = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MSimpleScrollGrid(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MSimpleScrollGrid(): Unit = js.native
  
  def computeScrollerDims(): ForceYScrollbars = js.native
  
  def computeShrinkWidth(): Double = js.native
  
  def handleSizing(): Unit = js.native
  
  def processCols(a: Any): Any = js.native
  
  def renderChunkTd(
    sectionConfig: SimpleScrollGridSection,
    microColGroupNode: VNode[js.Object],
    chunkConfig: ChunkConfig,
    isHeader: Boolean
  ): Element = js.native
  
  def renderMicroColGroup(cols: js.Array[ColProps]): VNode[js.Object] = js.native
  def renderMicroColGroup(cols: js.Array[ColProps], shrinkWidth: Double): VNode[js.Object] = js.native
  @JSName("renderMicroColGroup")
  var renderMicroColGroup_Original: js.Function2[
    /* cols */ js.Array[ColProps], 
    /* shrinkWidth */ js.UndefOr[Double], 
    VNode[js.Object]
  ] = js.native
  
  def renderSection(sectionConfig: SimpleScrollGridSection, microColGroupNode: VNode[js.Object], isHeader: Boolean): Element = js.native
  
  var scrollerElRefs: RefMap[HTMLElement] = js.native
  
  var scrollerRefs: RefMap[Scroller] = js.native
}
