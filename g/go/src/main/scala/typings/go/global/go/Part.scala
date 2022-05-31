package typings.go.global.go

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the base class for all user-manipulated top-level objects.
  * Because it inherits from Panel, it is automatically a visual container
  * of other GraphObjects.
  * Because it thus also inherits from GraphObject, it also has properties such as
  * GraphObject.actualBounds, GraphObject.contextMenu, and GraphObject.visible.
  */
@JSGlobal("go.Part")
@js.native
/**
  * The constructor builds an empty Part.
  * @param {EnumValue=} type if not supplied, the default Panel type is Panel.Position.
  */
class Part ()
  extends typings.go.mod.Part {
  def this(`type`: typings.go.mod.EnumValue) = this()
}
object Part {
  
  @JSGlobal("go.Part")
  @js.native
  val ^ : js.Any = js.native
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is added to a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSGlobal("go.Part.LayoutAdded")
  @js.native
  def LayoutAdded: Double = js.native
  inline def LayoutAdded_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutAdded")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Group has been laid out, it invalidates the Layout responsible for that Group; this flag is ignored for Parts that are not Groups.*/
  /* static member */
  @JSGlobal("go.Part.LayoutGroupLayout")
  @js.native
  def LayoutGroupLayout: Double = js.native
  inline def LayoutGroupLayout_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutGroupLayout")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes false, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSGlobal("go.Part.LayoutHidden")
  @js.native
  def LayoutHidden: Double = js.native
  inline def LayoutHidden_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutHidden")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Node or simple Part's .category changes, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  /* static member */
  @JSGlobal("go.Part.LayoutNodeReplaced")
  @js.native
  def LayoutNodeReplaced: Double = js.native
  inline def LayoutNodeReplaced_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNodeReplaced")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.actualBounds changes size, it invalidates the Layout responsible for the Part; this flag is ignored for Parts that are Links.*/
  /* static member */
  @JSGlobal("go.Part.LayoutNodeSized")
  @js.native
  def LayoutNodeSized: Double = js.native
  inline def LayoutNodeSized_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNodeSized")(x.asInstanceOf[js.Any])
  
  /**This value may be used as the value of the Part.layoutConditions property to indicate that no operation on this Part causes invalidation of the Layout responsible for this Part.*/
  /* static member */
  @JSGlobal("go.Part.LayoutNone")
  @js.native
  def LayoutNone: Double = js.native
  inline def LayoutNone_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutNone")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part is removed from a Diagram or Group, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSGlobal("go.Part.LayoutRemoved")
  @js.native
  def LayoutRemoved: Double = js.native
  inline def LayoutRemoved_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutRemoved")(x.asInstanceOf[js.Any])
  
  /**This flag may be combined with other "Layout" flags as the value of the Part.layoutConditions property to indicate that when a Part's GraphObject.visible becomes true, it invalidates the Layout responsible for the Part.*/
  /* static member */
  @JSGlobal("go.Part.LayoutShown")
  @js.native
  def LayoutShown: Double = js.native
  inline def LayoutShown_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutShown")(x.asInstanceOf[js.Any])
  
  /**This is the default value for the Part.layoutConditions property: the Layout responsible for the Part is invalidated when the Part is added or removed from the Diagram or Group or when it changes visibility or size or when a Group's layout has been performed.*/
  /* static member */
  @JSGlobal("go.Part.LayoutStandard")
  @js.native
  def LayoutStandard: Double = js.native
  inline def LayoutStandard_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LayoutStandard")(x.asInstanceOf[js.Any])
}
