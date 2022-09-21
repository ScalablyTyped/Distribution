package typings.fullcalendarCommon.mod

import typings.fullcalendarCommon.anon.ForceYScrollbars
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@fullcalendar/common", "SimpleScrollGrid")
@js.native
open class SimpleScrollGrid () extends BaseComponent[SimpleScrollGridProps, SimpleScrollGridState] {
  
  def _handleScrollerEl(scrollerEl: Null, key: String): Unit = js.native
  def _handleScrollerEl(scrollerEl: HTMLElement, key: String): Unit = js.native
  
  def componentDidMount(): Unit = js.native
  
  def componentDidUpdate(): Unit = js.native
  
  def componentWillUnmount(): Unit = js.native
  
  def computeScrollerDims(): ForceYScrollbars = js.native
  
  def computeShrinkWidth(): Double = js.native
  
  def handleSizing(): Unit = js.native
  
  def processCols(a: Any): Any = js.native
  
  def render(): Any = js.native
  
  def renderChunkTd(
    sectionConfig: SimpleScrollGridSection,
    microColGroupNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    chunkConfig: ChunkConfig,
    isHeader: Boolean
  ): Any = js.native
  
  def renderMicroColGroup(cols: js.Array[ColProps]): Any = js.native
  def renderMicroColGroup(cols: js.Array[ColProps], shrinkWidth: Double): Any = js.native
  @JSName("renderMicroColGroup")
  var renderMicroColGroup_Original: js.Function2[
    /* cols */ js.Array[ColProps], 
    /* shrinkWidth */ js.UndefOr[Double], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any
  ] = js.native
  
  def renderSection(
    sectionConfig: SimpleScrollGridSection,
    microColGroupNode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VNode */ Any,
    isHeader: Boolean
  ): Any = js.native
  
  var scrollerElRefs: RefMap[HTMLElement] = js.native
  
  var scrollerRefs: RefMap[Scroller] = js.native
  
  var state: SimpleScrollGridState = js.native
}
