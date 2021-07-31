package typings.ejWebAll.ej.datavisualization

import typings.ejWebAll.ej.Model
import typings.ejWebAll.ej.Widget_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeMap
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Method to drilldown the treemap.
    * @returns {void}
    */
  def drillDown(): Unit = js.native
  
  @JSName("model")
  var model_TreeMap: Model = js.native
  
  /** Method to reload treemap with updated values.
    * @returns {void}
    */
  def refresh(): Unit = js.native
}
object TreeMap {
  
  @js.native
  sealed trait DockPosition extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.DockPosition")
  @js.native
  object DockPosition extends StObject {
    
    //specifies the bottom position
    @js.native
    sealed trait Bottom
      extends StObject
         with DockPosition
    
    //specifies the left position
    @js.native
    sealed trait Left
      extends StObject
         with DockPosition
    
    //specifies the bottom position
    @js.native
    sealed trait Right
      extends StObject
         with DockPosition
    
    //specifies the top position
    @js.native
    sealed trait Top
      extends StObject
         with DockPosition
  }
  
  @js.native
  sealed trait ItemsLayoutMode extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.ItemsLayoutMode")
  @js.native
  object ItemsLayoutMode extends StObject {
    
    //specifies the sliceanddiceauto as layout type position
    @js.native
    sealed trait Sliceanddiceauto
      extends StObject
         with ItemsLayoutMode
    
    //specifies the sliceanddicehorizontal as layout type position
    @js.native
    sealed trait Sliceanddicehorizontal
      extends StObject
         with ItemsLayoutMode
    
    //specifies the sliceanddicevertical as layout type position
    @js.native
    sealed trait Sliceanddicevertical
      extends StObject
         with ItemsLayoutMode
    
    //specifies the squarified as layout type position
    @js.native
    sealed trait Squarified
      extends StObject
         with ItemsLayoutMode
  }
  
  @js.native
  sealed trait Position extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.Position")
  @js.native
  object Position extends StObject {
    
    //specifies the bottomcenter position
    @js.native
    sealed trait Bottomcenter
      extends StObject
         with Position
    
    //specifies the bottomleft position
    @js.native
    sealed trait Bottomleft
      extends StObject
         with Position
    
    //specifies the bottomright position
    @js.native
    sealed trait Bottomright
      extends StObject
         with Position
    
    //specifies the center position
    @js.native
    sealed trait Center
      extends StObject
         with Position
    
    //specifies the centerleft position
    @js.native
    sealed trait Centerleft
      extends StObject
         with Position
    
    //specifies the centerright position
    @js.native
    sealed trait Centerright
      extends StObject
         with Position
    
    //specifies the none position
    @js.native
    sealed trait None
      extends StObject
         with Position
    
    //specifies the topcenter position
    @js.native
    sealed trait Topcenter
      extends StObject
         with Position
    
    //specifies the topleft position
    @js.native
    sealed trait Topleft
      extends StObject
         with Position
    
    //specifies the topright position
    @js.native
    sealed trait Topright
      extends StObject
         with Position
  }
  
  @js.native
  sealed trait TextOverflow extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.TextOverflow")
  @js.native
  object TextOverflow extends StObject {
    
    //Hides the label when its width exceeds grid width
    @js.native
    sealed trait Hide
      extends StObject
         with TextOverflow
    
    //Displays the label within the grid width
    @js.native
    sealed trait None
      extends StObject
         with TextOverflow
    
    //Wrap the label by letter when its width exceeds grid width
    @js.native
    sealed trait Wrap
      extends StObject
         with TextOverflow
    
    //Wrap the label by word when its width exceeds grid width
    @js.native
    sealed trait WrapByWord
      extends StObject
         with TextOverflow
  }
  
  @js.native
  sealed trait VisibilityMode extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.VisibilityMode")
  @js.native
  object VisibilityMode extends StObject {
    
    //specifies the hide on exceeded length mode
    @js.native
    sealed trait Hideonexceededlength
      extends StObject
         with VisibilityMode
    
    //specifies the visible mode
    @js.native
    sealed trait Top
      extends StObject
         with VisibilityMode
  }
  
  @js.native
  sealed trait groupSelectionMode extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.groupSelectionMode")
  @js.native
  object groupSelectionMode extends StObject {
    
    //specifies the default mode
    @js.native
    sealed trait Default
      extends StObject
         with groupSelectionMode
    
    //specifies the multiple mode
    @js.native
    sealed trait Multiple
      extends StObject
         with groupSelectionMode
  }
  
  @js.native
  sealed trait selectionMode extends StObject
  @JSGlobal("ej.datavisualization.TreeMap.selectionMode")
  @js.native
  object selectionMode extends StObject {
    
    //specifies the default mode
    @js.native
    sealed trait Default
      extends StObject
         with selectionMode
    
    //specifies the multiple mode
    @js.native
    sealed trait Multiple
      extends StObject
         with selectionMode
  }
  
  trait ClickEventArgs extends StObject {
    
    /** Returns the clicked group of treeMapItems as  object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait DesaturationColorMapping extends StObject {
    
    /** Specifies the color for desaturationColorMapping
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the from value for desaturation color mapping
      * @Default {0}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** Specifies the rangeMaximum value for desaturation color mapping
      * @Default {0}
      */
    var rangeMaximum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the rangeMinimum value for desaturation color mapping
      * @Default {0}
      */
    var rangeMinimum: js.UndefOr[Double] = js.undefined
    
    /** Specifies the to value for desaturation color mapping
      * @Default {0}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object DesaturationColorMapping {
    
    @scala.inline
    def apply(): DesaturationColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DesaturationColorMapping]
    }
    
    @scala.inline
    implicit class DesaturationColorMappingMutableBuilder[Self <: DesaturationColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setRangeMaximum(value: Double): Self = StObject.set(x, "rangeMaximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeMaximumUndefined: Self = StObject.set(x, "rangeMaximum", js.undefined)
      
      @scala.inline
      def setRangeMinimum(value: Double): Self = StObject.set(x, "rangeMinimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeMinimumUndefined: Self = StObject.set(x, "rangeMinimum", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait DoubleClickEventArgs extends StObject {
    
    /** Returns the  double clicked group of treeMapItems as  object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object DoubleClickEventArgs {
    
    @scala.inline
    def apply(): DoubleClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DoubleClickEventArgs]
    }
    
    @scala.inline
    implicit class DoubleClickEventArgsMutableBuilder[Self <: DoubleClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait DrillDownItemSelectedEventArgs extends StObject {
    
    /** Returns selected drilldown treeMap object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object DrillDownItemSelectedEventArgs {
    
    @scala.inline
    def apply(): DrillDownItemSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillDownItemSelectedEventArgs]
    }
    
    @scala.inline
    implicit class DrillDownItemSelectedEventArgsMutableBuilder[Self <: DrillDownItemSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait DrillStartedEventArgs extends StObject {
    
    /** Returns selected drilled treeMap object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object DrillStartedEventArgs {
    
    @scala.inline
    def apply(): DrillStartedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrillStartedEventArgs]
    }
    
    @scala.inline
    implicit class DrillStartedEventArgsMutableBuilder[Self <: DrillStartedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait GroupColorMapping extends StObject {
    
    /** Specifies the groupID for GroupColorMapping.
      * @Default {null}
      */
    var groupID: js.UndefOr[String] = js.undefined
  }
  object GroupColorMapping {
    
    @scala.inline
    def apply(): GroupColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupColorMapping]
    }
    
    @scala.inline
    implicit class GroupColorMappingMutableBuilder[Self <: GroupColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupID(value: String): Self = StObject.set(x, "groupID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIDUndefined: Self = StObject.set(x, "groupID", js.undefined)
    }
  }
  
  trait HeaderTemplateRenderingEventArgs extends StObject {
    
    /** Returns drilldown header.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object HeaderTemplateRenderingEventArgs {
    
    @scala.inline
    def apply(): HeaderTemplateRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderTemplateRenderingEventArgs]
    }
    
    @scala.inline
    implicit class HeaderTemplateRenderingEventArgsMutableBuilder[Self <: HeaderTemplateRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait ItemRenderingEventArgs extends StObject {
    
    /** Returns treemap leaf item
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object ItemRenderingEventArgs {
    
    @scala.inline
    def apply(): ItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit class ItemRenderingEventArgsMutableBuilder[Self <: ItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait LeafItemSettings extends StObject {
    
    /** Specifies the border brush color of the leaf item.
      * @Default {white}
      */
    var borderBrush: js.UndefOr[String] = js.undefined
    
    /** Specifies the border thickness of the leaf item.
      * @Default {1}
      */
    var borderThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the space between the leaf items.
      * @Default {0}
      */
    var gap: js.UndefOr[Double] = js.undefined
    
    /** Specifies the label template of the leaf item.
      * @Default {null}
      */
    var itemTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the label path of the leaf item.
      * @Default {null}
      */
    var labelPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the position of the leaf labels.
      * @Default {center}
      */
    var labelPosition: js.UndefOr[Position | String] = js.undefined
    
    /** Specifies the mode of label visibility
      * @Default {visible}
      */
    var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.undefined
    
    /** Shows or hides the label of the leaf item.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the overflow options for leaf labels.
      * @Default {none}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  }
  object LeafItemSettings {
    
    @scala.inline
    def apply(): LeafItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeafItemSettings]
    }
    
    @scala.inline
    implicit class LeafItemSettingsMutableBuilder[Self <: LeafItemSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderBrush(value: String): Self = StObject.set(x, "borderBrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBrushUndefined: Self = StObject.set(x, "borderBrush", js.undefined)
      
      @scala.inline
      def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
      
      @scala.inline
      def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setItemTemplate(value: String): Self = StObject.set(x, "itemTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTemplateUndefined: Self = StObject.set(x, "itemTemplate", js.undefined)
      
      @scala.inline
      def setLabelPath(value: String): Self = StObject.set(x, "labelPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPathUndefined: Self = StObject.set(x, "labelPath", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: Position | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelVisibilityMode(value: VisibilityMode | String): Self = StObject.set(x, "labelVisibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelVisibilityModeUndefined: Self = StObject.set(x, "labelVisibilityMode", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    }
  }
  
  trait LegendItemRenderingEventArgs extends StObject {
    
    /** Returns treemap legend item
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object LegendItemRenderingEventArgs {
    
    @scala.inline
    def apply(): LegendItemRenderingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendItemRenderingEventArgs]
    }
    
    @scala.inline
    implicit class LegendItemRenderingEventArgsMutableBuilder[Self <: LegendItemRenderingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait LegendSettings extends StObject {
    
    /** Specifies the alignment text for legend
      * @Default {near}
      */
    var alignment: js.UndefOr[String] = js.undefined
    
    /** Specifies the alignment text for legend
      * @Default {0}
      */
    var columnCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the dockPosition text for legend
      * @Default {top}
      */
    var dockPosition: js.UndefOr[String] = js.undefined
    
    /** Specifies the height for legend
      * @Default {30}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Specifies the iconHeight for legend
      * @Default {15}
      */
    var iconHeight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the iconWidth for legend
      * @Default {15}
      */
    var iconWidth: js.UndefOr[Double] = js.undefined
    
    /** Specifies the leftLabel text for legend
      */
    var leftLabel: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode for legendSettings whether default or interactive mode
      * @Default {default}
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /** Specifies the rightLabel text for legend
      */
    var rightLabel: js.UndefOr[String] = js.undefined
    
    /** Specifies the template for legendSettings
      * @Default {null}
      */
    var template: js.UndefOr[String] = js.undefined
    
    /** Specifies the title text for legend
      */
    var title: js.UndefOr[String] = js.undefined
    
    /** Specifies the width for legend
      * @Default {100}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object LegendSettings {
    
    @scala.inline
    def apply(): LegendSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LegendSettings]
    }
    
    @scala.inline
    implicit class LegendSettingsMutableBuilder[Self <: LegendSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignment(value: String): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      @scala.inline
      def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      @scala.inline
      def setDockPosition(value: String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setIconHeight(value: Double): Self = StObject.set(x, "iconHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconHeightUndefined: Self = StObject.set(x, "iconHeight", js.undefined)
      
      @scala.inline
      def setIconWidth(value: Double): Self = StObject.set(x, "iconWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconWidthUndefined: Self = StObject.set(x, "iconWidth", js.undefined)
      
      @scala.inline
      def setLeftLabel(value: String): Self = StObject.set(x, "leftLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftLabelUndefined: Self = StObject.set(x, "leftLabel", js.undefined)
      
      @scala.inline
      def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setRightLabel(value: String): Self = StObject.set(x, "rightLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightLabelUndefined: Self = StObject.set(x, "rightLabel", js.undefined)
      
      @scala.inline
      def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Level extends StObject {
    
    /** specifies the group background
      * @Default {null}
      */
    var groupBackground: js.UndefOr[String] = js.undefined
    
    /** Specifies the group border color for tree map level.
      * @Default {null}
      */
    var groupBorderColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the group border thickness for tree map level.
      * @Default {1}
      */
    var groupBorderThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the group gap for tree map level.
      * @Default {1}
      */
    var groupGap: js.UndefOr[Double] = js.undefined
    
    /** Specifies the group padding for tree map level.
      * @Default {4}
      */
    var groupPadding: js.UndefOr[Double] = js.undefined
    
    /** Specifies the group path for tree map level.
      */
    var groupPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the header height for tree map level.
      * @Default {0}
      */
    var headerHeight: js.UndefOr[Double] = js.undefined
    
    /** Specifies the header template for tree map level.
      * @Default {null}
      */
    var headerTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of header visibility
      * @Default {visible}
      */
    var headerVisibilityMode: js.UndefOr[VisibilityMode | String] = js.undefined
    
    /** Specifies the position of the labels.
      * @Default {center}
      */
    var labelPosition: js.UndefOr[Position | String] = js.undefined
    
    /** Specifies the label template for tree map level.
      * @Default {null}
      */
    var labelTemplate: js.UndefOr[String] = js.undefined
    
    /** Specifies the mode of label visibility
      * @Default {visible}
      */
    var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.undefined
    
    /** Shows or hides the header for tree map level.
      * @Default {false}
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the labels for tree map level.
      * @Default {false}
      */
    var showLabels: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the overflow options for leaf labels.
      * @Default {none}
      */
    var textOverflow: js.UndefOr[TextOverflow | String] = js.undefined
  }
  object Level {
    
    @scala.inline
    def apply(): Level = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Level]
    }
    
    @scala.inline
    implicit class LevelMutableBuilder[Self <: Level] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGroupBackground(value: String): Self = StObject.set(x, "groupBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBackgroundUndefined: Self = StObject.set(x, "groupBackground", js.undefined)
      
      @scala.inline
      def setGroupBorderColor(value: String): Self = StObject.set(x, "groupBorderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBorderColorUndefined: Self = StObject.set(x, "groupBorderColor", js.undefined)
      
      @scala.inline
      def setGroupBorderThickness(value: Double): Self = StObject.set(x, "groupBorderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupBorderThicknessUndefined: Self = StObject.set(x, "groupBorderThickness", js.undefined)
      
      @scala.inline
      def setGroupGap(value: Double): Self = StObject.set(x, "groupGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupGapUndefined: Self = StObject.set(x, "groupGap", js.undefined)
      
      @scala.inline
      def setGroupPadding(value: Double): Self = StObject.set(x, "groupPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupPaddingUndefined: Self = StObject.set(x, "groupPadding", js.undefined)
      
      @scala.inline
      def setGroupPath(value: String): Self = StObject.set(x, "groupPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupPathUndefined: Self = StObject.set(x, "groupPath", js.undefined)
      
      @scala.inline
      def setHeaderHeight(value: Double): Self = StObject.set(x, "headerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderHeightUndefined: Self = StObject.set(x, "headerHeight", js.undefined)
      
      @scala.inline
      def setHeaderTemplate(value: String): Self = StObject.set(x, "headerTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateUndefined: Self = StObject.set(x, "headerTemplate", js.undefined)
      
      @scala.inline
      def setHeaderVisibilityMode(value: VisibilityMode | String): Self = StObject.set(x, "headerVisibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderVisibilityModeUndefined: Self = StObject.set(x, "headerVisibilityMode", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: Position | String): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelTemplate(value: String): Self = StObject.set(x, "labelTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelTemplateUndefined: Self = StObject.set(x, "labelTemplate", js.undefined)
      
      @scala.inline
      def setLabelVisibilityMode(value: VisibilityMode | String): Self = StObject.set(x, "labelVisibilityMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelVisibilityModeUndefined: Self = StObject.set(x, "labelVisibilityMode", js.undefined)
      
      @scala.inline
      def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      @scala.inline
      def setShowLabels(value: Boolean): Self = StObject.set(x, "showLabels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLabelsUndefined: Self = StObject.set(x, "showLabels", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: TextOverflow | String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Fires, on clicking the tree map items.
      */
    var Click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the border brush color of the treemap
      * @Default {white}
      */
    var borderBrush: js.UndefOr[String] = js.undefined
    
    /** Specifies the border thickness of the treemap
      * @Default {1}
      */
    var borderThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the field name in the datasource that contains color values for treemap items.
      * @Default {null}
      */
    var colorPath: js.UndefOr[String] = js.undefined
    
    /** Specifies the color value path of the treemap
      * @Default {null}
      */
    var colorValuePath: js.UndefOr[String] = js.undefined
    
    /** Specifies the datasource of the treemap
      * @Default {null}
      */
    var dataSource: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the desaturationColorMapping settings of the treemap
      */
    var desaturationColorMapping: js.UndefOr[DesaturationColorMapping] = js.undefined
    
    /** Specifies the dockPosition for legend
      * @Default {top}
      */
    var dockPosition: js.UndefOr[DockPosition | String] = js.undefined
    
    /** Fires, on double clicking the tree map items.
      */
    var doubleClick: js.UndefOr[js.Function1[/* e */ DoubleClickEventArgs, Unit]] = js.undefined
    
    /** This property is used to select group of treemap items while clicking and dragging
      * @Default {false}
      */
    var draggingGroupOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** This property is used to select treemap items while clicking and dragging
      * @Default {false}
      */
    var draggingOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** specifies the drillDown header color
      * @Default {'null'}
      */
    var drillDownHeaderColor: js.UndefOr[String] = js.undefined
    
    /** Triggers on treemap  drilldown  item  selected.
      */
    var drillDownItemSelected: js.UndefOr[js.Function1[/* e */ DrillDownItemSelectedEventArgs, Unit]] = js.undefined
    
    /** Specifies to render particular level of the treemap.
      * @Default {0}
      */
    var drillDownLevel: js.UndefOr[Double] = js.undefined
    
    /** specifies the drillDown selection color
      * @Default {'#000000'}
      */
    var drillDownSelectionColor: js.UndefOr[String] = js.undefined
    
    /** Specifies to drill the particular data of the treemap.
      * @Default {null}
      */
    var drillDownValue: js.UndefOr[String] = js.undefined
    
    /** Triggers when drilldown is started
      */
    var drillStarted: js.UndefOr[js.Function1[/* e */ DrillStartedEventArgs, Unit]] = js.undefined
    
    /** Enable/Disable the drillDown for treemap
      * @Default {false}
      */
    var enableDrillDown: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether gradient color has to be applied for treemap items
      * @Default {false}
      */
    var enableGradient: js.UndefOr[Boolean] = js.undefined
    
    /** Specify to convert the date object to string, using locale settings.
      * @Default {false}
      */
    var enableGroupSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether treemap need to resize when container is resized
      * @Default {true}
      */
    var enableResize: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the group color mapping of the treemap
      * @Default {[]}
      */
    var groupColorMapping: js.UndefOr[js.Array[GroupColorMapping]] = js.undefined
    
    /** Specifies the selection mode of the treemap. Accepted selection mode values are Default and Multiple.
      * @Default {default}
      */
    var groupSelectionMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.groupSelectionMode | String] = js.undefined
    
    /** Specifies the header for parent item during drilldown. This is applicable only for hierarchical data source.
      * @Default {null}
      */
    var header: js.UndefOr[String] = js.undefined
    
    /** Triggers before rendering the treemap drilldown header template
      */
    var headerTemplateRendering: js.UndefOr[js.Function1[/* e */ HeaderTemplateRenderingEventArgs, Unit]] = js.undefined
    
    /** Specifies the highlight border brush of treemap
      * @Default {gray}
      */
    var highlightBorderBrush: js.UndefOr[String] = js.undefined
    
    /** Specifies the border thickness when treemap items is highlighted in the treemap
      * @Default {5}
      */
    var highlightBorderThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies the highlight border brush of treemap
      * @Default {gray}
      */
    var highlightGroupBorderBrush: js.UndefOr[String] = js.undefined
    
    /** Specifies the border thickness when treemap items is highlighted in the treemap
      * @Default {5}
      */
    var highlightGroupBorderThickness: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether treemap item need to highlighted on selection
      * @Default {false}
      */
    var highlightGroupOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether treemap item need to highlighted on selection
      * @Default {false}
      */
    var highlightOnSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether datasource is hierarchical or not.
      * @Default {false}
      */
    var isHierarchicalDatasource: js.UndefOr[Boolean] = js.undefined
    
    /** Controls whether Treemap has to be responsive while resizing the window.
      * @Default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers while rendering each treemap items.
      */
    var itemRendering: js.UndefOr[js.Function1[/* e */ ItemRenderingEventArgs, Unit]] = js.undefined
    
    /** Specifies the items layout mode of the treemap. Accepted itemsLayoutMode values are Squarified, SliceAndDiceHorizontal, SliceAndDiceVertical and SliceAndDiceAuto
      * @Default {Squarified}
      */
    var itemsLayoutMode: js.UndefOr[ItemsLayoutMode | String] = js.undefined
    
    /** Specifies the leaf settings of the treemap
      */
    var leafItemSettings: js.UndefOr[LeafItemSettings] = js.undefined
    
    /** Triggers while rendering each legend item
      */
    var legendItemRendering: js.UndefOr[js.Function1[/* e */ LegendItemRenderingEventArgs, Unit]] = js.undefined
    
    /** Specifies the legend settings of the treemap
      */
    var legendSettings: js.UndefOr[LegendSettings] = js.undefined
    
    /** Specify levels of treemap for grouped visualization of data
      * @Default {[]}
      */
    var levels: js.UndefOr[js.Array[Level]] = js.undefined
    
    /** Name of the culture based on which Tree Map should be localized.
      * @Default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Specifies the paletteColorMapping of the treemap
      */
    var paletteColorMapping: js.UndefOr[PaletteColorMapping] = js.undefined
    
    /** Specifies the rangeColorMapping settings of the treemap
      * @Default {[]}
      */
    var rangeColorMapping: js.UndefOr[js.Array[RangeColorMapping]] = js.undefined
    
    /** Triggers after refreshing the treemap items.
      */
    var refreshed: js.UndefOr[js.Function1[/* e */ RefreshedEventArgs, Unit]] = js.undefined
    
    /** Fires, on right clicking the tree map items.
      */
    var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the selection mode of treemap item. Accepted selection mode values are Default and Multiple.
      * @Default {default}
      */
    var selectionMode: js.UndefOr[typings.ejWebAll.ej.datavisualization.TreeMap.selectionMode | String] = js.undefined
    
    /** Specifies the legend visibility status of the treemap
      * @Default {false}
      */
    var showLegend: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies whether treemap showTooltip need to be visible
      */
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the tooltip template of the treemap
      * @Default {null}
      */
    var tooltipTemplate: js.UndefOr[String] = js.undefined
    
    /** Triggers when the group selection is performed on treemap items.
      */
    var treeMapGroupSelected: js.UndefOr[js.Function1[/* e */ TreeMapGroupSelectedEventArgs, Unit]] = js.undefined
    
    /** Triggers on treemap item selected.
      */
    var treeMapItemSelected: js.UndefOr[js.Function1[/* e */ TreeMapItemSelectedEventArgs, Unit]] = js.undefined
    
    /** Hold the treeMapItems to be displayed in treemap
      * @Default {[]}
      */
    var treeMapItems: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the uniColorMapping settings of the treemap
      */
    var uniColorMapping: js.UndefOr[UniColorMapping] = js.undefined
    
    /** Specifies the weight value path of the treemap
      * @Default {null}
      */
    var weightValuePath: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.datavisualization.TreeMap.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.datavisualization.TreeMap.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.datavisualization.TreeMap.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBorderBrush(value: String): Self = StObject.set(x, "borderBrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderBrushUndefined: Self = StObject.set(x, "borderBrush", js.undefined)
      
      @scala.inline
      def setBorderThickness(value: Double): Self = StObject.set(x, "borderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderThicknessUndefined: Self = StObject.set(x, "borderThickness", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "Click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "Click", js.undefined)
      
      @scala.inline
      def setColorPath(value: String): Self = StObject.set(x, "colorPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorPathUndefined: Self = StObject.set(x, "colorPath", js.undefined)
      
      @scala.inline
      def setColorValuePath(value: String): Self = StObject.set(x, "colorValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorValuePathUndefined: Self = StObject.set(x, "colorValuePath", js.undefined)
      
      @scala.inline
      def setDataSource(value: js.Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      @scala.inline
      def setDesaturationColorMapping(value: DesaturationColorMapping): Self = StObject.set(x, "desaturationColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDesaturationColorMappingUndefined: Self = StObject.set(x, "desaturationColorMapping", js.undefined)
      
      @scala.inline
      def setDockPosition(value: DockPosition | String): Self = StObject.set(x, "dockPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDockPositionUndefined: Self = StObject.set(x, "dockPosition", js.undefined)
      
      @scala.inline
      def setDoubleClick(value: /* e */ DoubleClickEventArgs => Unit): Self = StObject.set(x, "doubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDoubleClickUndefined: Self = StObject.set(x, "doubleClick", js.undefined)
      
      @scala.inline
      def setDraggingGroupOnSelection(value: Boolean): Self = StObject.set(x, "draggingGroupOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingGroupOnSelectionUndefined: Self = StObject.set(x, "draggingGroupOnSelection", js.undefined)
      
      @scala.inline
      def setDraggingOnSelection(value: Boolean): Self = StObject.set(x, "draggingOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggingOnSelectionUndefined: Self = StObject.set(x, "draggingOnSelection", js.undefined)
      
      @scala.inline
      def setDrillDownHeaderColor(value: String): Self = StObject.set(x, "drillDownHeaderColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownHeaderColorUndefined: Self = StObject.set(x, "drillDownHeaderColor", js.undefined)
      
      @scala.inline
      def setDrillDownItemSelected(value: /* e */ DrillDownItemSelectedEventArgs => Unit): Self = StObject.set(x, "drillDownItemSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillDownItemSelectedUndefined: Self = StObject.set(x, "drillDownItemSelected", js.undefined)
      
      @scala.inline
      def setDrillDownLevel(value: Double): Self = StObject.set(x, "drillDownLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownLevelUndefined: Self = StObject.set(x, "drillDownLevel", js.undefined)
      
      @scala.inline
      def setDrillDownSelectionColor(value: String): Self = StObject.set(x, "drillDownSelectionColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownSelectionColorUndefined: Self = StObject.set(x, "drillDownSelectionColor", js.undefined)
      
      @scala.inline
      def setDrillDownValue(value: String): Self = StObject.set(x, "drillDownValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrillDownValueUndefined: Self = StObject.set(x, "drillDownValue", js.undefined)
      
      @scala.inline
      def setDrillStarted(value: /* e */ DrillStartedEventArgs => Unit): Self = StObject.set(x, "drillStarted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDrillStartedUndefined: Self = StObject.set(x, "drillStarted", js.undefined)
      
      @scala.inline
      def setEnableDrillDown(value: Boolean): Self = StObject.set(x, "enableDrillDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableDrillDownUndefined: Self = StObject.set(x, "enableDrillDown", js.undefined)
      
      @scala.inline
      def setEnableGradient(value: Boolean): Self = StObject.set(x, "enableGradient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGradientUndefined: Self = StObject.set(x, "enableGradient", js.undefined)
      
      @scala.inline
      def setEnableGroupSeparator(value: Boolean): Self = StObject.set(x, "enableGroupSeparator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableGroupSeparatorUndefined: Self = StObject.set(x, "enableGroupSeparator", js.undefined)
      
      @scala.inline
      def setEnableResize(value: Boolean): Self = StObject.set(x, "enableResize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableResizeUndefined: Self = StObject.set(x, "enableResize", js.undefined)
      
      @scala.inline
      def setGroupColorMapping(value: js.Array[GroupColorMapping]): Self = StObject.set(x, "groupColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupColorMappingUndefined: Self = StObject.set(x, "groupColorMapping", js.undefined)
      
      @scala.inline
      def setGroupColorMappingVarargs(value: GroupColorMapping*): Self = StObject.set(x, "groupColorMapping", js.Array(value :_*))
      
      @scala.inline
      def setGroupSelectionMode(value: groupSelectionMode | String): Self = StObject.set(x, "groupSelectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupSelectionModeUndefined: Self = StObject.set(x, "groupSelectionMode", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderTemplateRendering(value: /* e */ HeaderTemplateRenderingEventArgs => Unit): Self = StObject.set(x, "headerTemplateRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderTemplateRenderingUndefined: Self = StObject.set(x, "headerTemplateRendering", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHighlightBorderBrush(value: String): Self = StObject.set(x, "highlightBorderBrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightBorderBrushUndefined: Self = StObject.set(x, "highlightBorderBrush", js.undefined)
      
      @scala.inline
      def setHighlightBorderThickness(value: Double): Self = StObject.set(x, "highlightBorderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightBorderThicknessUndefined: Self = StObject.set(x, "highlightBorderThickness", js.undefined)
      
      @scala.inline
      def setHighlightGroupBorderBrush(value: String): Self = StObject.set(x, "highlightGroupBorderBrush", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGroupBorderBrushUndefined: Self = StObject.set(x, "highlightGroupBorderBrush", js.undefined)
      
      @scala.inline
      def setHighlightGroupBorderThickness(value: Double): Self = StObject.set(x, "highlightGroupBorderThickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGroupBorderThicknessUndefined: Self = StObject.set(x, "highlightGroupBorderThickness", js.undefined)
      
      @scala.inline
      def setHighlightGroupOnSelection(value: Boolean): Self = StObject.set(x, "highlightGroupOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightGroupOnSelectionUndefined: Self = StObject.set(x, "highlightGroupOnSelection", js.undefined)
      
      @scala.inline
      def setHighlightOnSelection(value: Boolean): Self = StObject.set(x, "highlightOnSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightOnSelectionUndefined: Self = StObject.set(x, "highlightOnSelection", js.undefined)
      
      @scala.inline
      def setIsHierarchicalDatasource(value: Boolean): Self = StObject.set(x, "isHierarchicalDatasource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHierarchicalDatasourceUndefined: Self = StObject.set(x, "isHierarchicalDatasource", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setItemRendering(value: /* e */ ItemRenderingEventArgs => Unit): Self = StObject.set(x, "itemRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setItemRenderingUndefined: Self = StObject.set(x, "itemRendering", js.undefined)
      
      @scala.inline
      def setItemsLayoutMode(value: ItemsLayoutMode | String): Self = StObject.set(x, "itemsLayoutMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsLayoutModeUndefined: Self = StObject.set(x, "itemsLayoutMode", js.undefined)
      
      @scala.inline
      def setLeafItemSettings(value: LeafItemSettings): Self = StObject.set(x, "leafItemSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeafItemSettingsUndefined: Self = StObject.set(x, "leafItemSettings", js.undefined)
      
      @scala.inline
      def setLegendItemRendering(value: /* e */ LegendItemRenderingEventArgs => Unit): Self = StObject.set(x, "legendItemRendering", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLegendItemRenderingUndefined: Self = StObject.set(x, "legendItemRendering", js.undefined)
      
      @scala.inline
      def setLegendSettings(value: LegendSettings): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendSettingsUndefined: Self = StObject.set(x, "legendSettings", js.undefined)
      
      @scala.inline
      def setLevels(value: js.Array[Level]): Self = StObject.set(x, "levels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelsUndefined: Self = StObject.set(x, "levels", js.undefined)
      
      @scala.inline
      def setLevelsVarargs(value: Level*): Self = StObject.set(x, "levels", js.Array(value :_*))
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPaletteColorMapping(value: PaletteColorMapping): Self = StObject.set(x, "paletteColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaletteColorMappingUndefined: Self = StObject.set(x, "paletteColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMapping(value: js.Array[RangeColorMapping]): Self = StObject.set(x, "rangeColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeColorMappingUndefined: Self = StObject.set(x, "rangeColorMapping", js.undefined)
      
      @scala.inline
      def setRangeColorMappingVarargs(value: RangeColorMapping*): Self = StObject.set(x, "rangeColorMapping", js.Array(value :_*))
      
      @scala.inline
      def setRefreshed(value: /* e */ RefreshedEventArgs => Unit): Self = StObject.set(x, "refreshed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefreshedUndefined: Self = StObject.set(x, "refreshed", js.undefined)
      
      @scala.inline
      def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = StObject.set(x, "rightClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRightClickUndefined: Self = StObject.set(x, "rightClick", js.undefined)
      
      @scala.inline
      def setSelectionMode(value: selectionMode | String): Self = StObject.set(x, "selectionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionModeUndefined: Self = StObject.set(x, "selectionMode", js.undefined)
      
      @scala.inline
      def setShowLegend(value: Boolean): Self = StObject.set(x, "showLegend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLegendUndefined: Self = StObject.set(x, "showLegend", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setTooltipTemplate(value: String): Self = StObject.set(x, "tooltipTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTemplateUndefined: Self = StObject.set(x, "tooltipTemplate", js.undefined)
      
      @scala.inline
      def setTreeMapGroupSelected(value: /* e */ TreeMapGroupSelectedEventArgs => Unit): Self = StObject.set(x, "treeMapGroupSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeMapGroupSelectedUndefined: Self = StObject.set(x, "treeMapGroupSelected", js.undefined)
      
      @scala.inline
      def setTreeMapItemSelected(value: /* e */ TreeMapItemSelectedEventArgs => Unit): Self = StObject.set(x, "treeMapItemSelected", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTreeMapItemSelectedUndefined: Self = StObject.set(x, "treeMapItemSelected", js.undefined)
      
      @scala.inline
      def setTreeMapItems(value: js.Array[js.Any]): Self = StObject.set(x, "treeMapItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTreeMapItemsUndefined: Self = StObject.set(x, "treeMapItems", js.undefined)
      
      @scala.inline
      def setTreeMapItemsVarargs(value: js.Any*): Self = StObject.set(x, "treeMapItems", js.Array(value :_*))
      
      @scala.inline
      def setUniColorMapping(value: UniColorMapping): Self = StObject.set(x, "uniColorMapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniColorMappingUndefined: Self = StObject.set(x, "uniColorMapping", js.undefined)
      
      @scala.inline
      def setWeightValuePath(value: String): Self = StObject.set(x, "weightValuePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeightValuePathUndefined: Self = StObject.set(x, "weightValuePath", js.undefined)
    }
  }
  
  trait PaletteColorMapping extends StObject {
    
    /** Specifies the colors of the paletteColorMapping
      * @Default {[]}
      */
    var colors: js.UndefOr[js.Array[js.Any]] = js.undefined
  }
  object PaletteColorMapping {
    
    @scala.inline
    def apply(): PaletteColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaletteColorMapping]
    }
    
    @scala.inline
    implicit class PaletteColorMappingMutableBuilder[Self <: PaletteColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: js.Array[js.Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setColorsVarargs(value: js.Any*): Self = StObject.set(x, "colors", js.Array(value :_*))
    }
  }
  
  trait RangeColorMapping extends StObject {
    
    /** Specifies the color value for rangeColorMapping.
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the from value for rangeColorMapping.
      * @Default {-1}
      */
    var from: js.UndefOr[Double] = js.undefined
    
    /** specifies the gradient colors for th given range value
      * @Default {[]}
      */
    var gradientColors: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    /** Specifies the legend label value for rangeColorMapping.
      * @Default {null}
      */
    var legendLabel: js.UndefOr[String] = js.undefined
    
    /** Specifies the to value for rangeColorMapping.
      * @Default {-1}
      */
    var to: js.UndefOr[Double] = js.undefined
  }
  object RangeColorMapping {
    
    @scala.inline
    def apply(): RangeColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeColorMapping]
    }
    
    @scala.inline
    implicit class RangeColorMappingMutableBuilder[Self <: RangeColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGradientColors(value: js.Array[js.Any]): Self = StObject.set(x, "gradientColors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGradientColorsUndefined: Self = StObject.set(x, "gradientColors", js.undefined)
      
      @scala.inline
      def setGradientColorsVarargs(value: js.Any*): Self = StObject.set(x, "gradientColors", js.Array(value :_*))
      
      @scala.inline
      def setLegendLabel(value: String): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    }
  }
  
  trait RefreshedEventArgs extends StObject {
    
    /** Refresh and load the treemap.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object RefreshedEventArgs {
    
    @scala.inline
    def apply(): RefreshedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefreshedEventArgs]
    }
    
    @scala.inline
    implicit class RefreshedEventArgsMutableBuilder[Self <: RefreshedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait RightClickEventArgs extends StObject {
    
    /** Returns the right clicked group of treeMapItems as  object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object RightClickEventArgs {
    
    @scala.inline
    def apply(): RightClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RightClickEventArgs]
    }
    
    @scala.inline
    implicit class RightClickEventArgsMutableBuilder[Self <: RightClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait TreeMapGroupSelectedEventArgs extends StObject {
    
    /** Returns the  selected group of treeMapItems as  object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object TreeMapGroupSelectedEventArgs {
    
    @scala.inline
    def apply(): TreeMapGroupSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeMapGroupSelectedEventArgs]
    }
    
    @scala.inline
    implicit class TreeMapGroupSelectedEventArgsMutableBuilder[Self <: TreeMapGroupSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait TreeMapItemSelectedEventArgs extends StObject {
    
    /** Returns selected treeMapItem object.
      */
    var originalEvent: js.UndefOr[js.Any] = js.undefined
  }
  object TreeMapItemSelectedEventArgs {
    
    @scala.inline
    def apply(): TreeMapItemSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TreeMapItemSelectedEventArgs]
    }
    
    @scala.inline
    implicit class TreeMapItemSelectedEventArgsMutableBuilder[Self <: TreeMapItemSelectedEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOriginalEvent(value: js.Any): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalEventUndefined: Self = StObject.set(x, "originalEvent", js.undefined)
    }
  }
  
  trait UniColorMapping extends StObject {
    
    /** Specifies the uniform color mapping of the treemap
      * @Default {null}
      */
    var color: js.UndefOr[String] = js.undefined
  }
  object UniColorMapping {
    
    @scala.inline
    def apply(): UniColorMapping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UniColorMapping]
    }
    
    @scala.inline
    implicit class UniColorMappingMutableBuilder[Self <: UniColorMapping] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
}
