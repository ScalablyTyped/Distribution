package typings.gaeaModel

import typings.gaeaModel.FitGaea.ComponentProps
import typings.gaeaModel.FitGaea.Number
import typings.gaeaModel.FitGaea.ViewportComponentFullInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait BeforeName extends StObject {
    
    var beforeName: String = js.native
    
    // 重置前的信息
    var beforeProps: ComponentProps = js.native
  }
  object BeforeName {
    
    @scala.inline
    def apply(beforeName: String, beforeProps: ComponentProps): BeforeName = {
      val __obj = js.Dynamic.literal(beforeName = beforeName.asInstanceOf[js.Any], beforeProps = beforeProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeforeName]
    }
    
    @scala.inline
    implicit class BeforeNameMutableBuilder[Self <: BeforeName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBeforeName(value: String): Self = StObject.set(x, "beforeName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeProps(value: ComponentProps): Self = StObject.set(x, "beforeProps", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentInfo extends StObject {
    
    // 组合的完整信息（不是 copy 的, 是真正对应的 mapUniqueKey）
    var componentInfo: ViewportComponentFullInfo = js.native
    
    // 父级的 index
    var index: Double = js.native
    
    // 父级 mapKey
    var parentMapUniqueKey: String = js.native
  }
  object ComponentInfo {
    
    @scala.inline
    def apply(componentInfo: ViewportComponentFullInfo, index: Double, parentMapUniqueKey: String): ComponentInfo = {
      val __obj = js.Dynamic.literal(componentInfo = componentInfo.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentInfo]
    }
    
    @scala.inline
    implicit class ComponentInfoMutableBuilder[Self <: ComponentInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponentInfo(value: ViewportComponentFullInfo): Self = StObject.set(x, "componentInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMapUniqueKey(value: String): Self = StObject.set(x, "parentMapUniqueKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CurrentUnit extends StObject {
    
    var currentUnit: String = js.native
    
    var inputRange: js.UndefOr[js.Array[Double]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var outputRange: js.UndefOr[js.Array[Double]] = js.native
    
    var slider: js.UndefOr[Boolean] = js.native
    
    var speed: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
    
    var units: js.Array[Number] = js.native
  }
  object CurrentUnit {
    
    @scala.inline
    def apply(currentUnit: String, units: js.Array[Number]): CurrentUnit = {
      val __obj = js.Dynamic.literal(currentUnit = currentUnit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentUnit]
    }
    
    @scala.inline
    implicit class CurrentUnitMutableBuilder[Self <: CurrentUnit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentUnit(value: String): Self = StObject.set(x, "currentUnit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRange(value: js.Array[Double]): Self = StObject.set(x, "inputRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputRangeUndefined: Self = StObject.set(x, "inputRange", js.undefined)
      
      @scala.inline
      def setInputRangeVarargs(value: Double*): Self = StObject.set(x, "inputRange", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOutputRange(value: js.Array[Double]): Self = StObject.set(x, "outputRange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputRangeUndefined: Self = StObject.set(x, "outputRange", js.undefined)
      
      @scala.inline
      def setOutputRangeVarargs(value: Double*): Self = StObject.set(x, "outputRange", js.Array(value :_*))
      
      @scala.inline
      def setSlider(value: Boolean): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setUnits(value: js.Array[Number]): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitsVarargs(value: Number*): Self = StObject.set(x, "units", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    // 插入的位置
    var index: Double = js.native
    
    // 父级 mapKey
    var parentMapUniqueKey: String = js.native
    
    // 新增组件的唯一标识 id
    var uniqueId: String = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, parentMapUniqueKey: String, uniqueId: String): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], parentMapUniqueKey = parentMapUniqueKey.asInstanceOf[js.Any], uniqueId = uniqueId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentMapUniqueKey(value: String): Self = StObject.set(x, "parentMapUniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUniqueId(value: String): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MapUniqueKey extends StObject {
    
    // 当前拖拽组件的 mapUniqueKey
    var mapUniqueKey: String = js.native
    
    // 拖拽目标的 index
    var targetIndex: js.UndefOr[Double] = js.native
    
    // 拖拽目标的 mapUniqueKey
    var targetMapUniqueKey: js.UndefOr[String] = js.native
  }
  object MapUniqueKey {
    
    @scala.inline
    def apply(mapUniqueKey: String): MapUniqueKey = {
      val __obj = js.Dynamic.literal(mapUniqueKey = mapUniqueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[MapUniqueKey]
    }
    
    @scala.inline
    implicit class MapUniqueKeyMutableBuilder[Self <: MapUniqueKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMapUniqueKey(value: String): Self = StObject.set(x, "mapUniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIndexUndefined: Self = StObject.set(x, "targetIndex", js.undefined)
      
      @scala.inline
      def setTargetMapUniqueKey(value: String): Self = StObject.set(x, "targetMapUniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetMapUniqueKeyUndefined: Self = StObject.set(x, "targetMapUniqueKey", js.undefined)
    }
  }
  
  @js.native
  trait NewIndex extends StObject {
    
    var newIndex: Double = js.native
    
    var oldIndex: Double = js.native
  }
  object NewIndex {
    
    @scala.inline
    def apply(newIndex: Double, oldIndex: Double): NewIndex = {
      val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewIndex]
    }
    
    @scala.inline
    implicit class NewIndexMutableBuilder[Self <: NewIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NewValue extends StObject {
    
    var newValue: ComponentProps = js.native
    
    var oldValue: ComponentProps = js.native
  }
  object NewValue {
    
    @scala.inline
    def apply(newValue: ComponentProps, oldValue: ComponentProps): NewValue = {
      val __obj = js.Dynamic.literal(newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewValue]
    }
    
    @scala.inline
    implicit class NewValueMutableBuilder[Self <: NewValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewValue(value: ComponentProps): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldValue(value: ComponentProps): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Source extends StObject {
    
    // combo 信息
    var source: String = js.native
  }
  object Source {
    
    @scala.inline
    def apply(source: String): Source = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    @scala.inline
    implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SourceIndex extends StObject {
    
    // 移除的位置
    var sourceIndex: Double = js.native
    
    // 移动前父级 mapKey
    var sourceParentMapUniqueKey: String = js.native
    
    // 插入的位置
    var targetIndex: Double = js.native
    
    // 移动到的父级 mapKey
    var targetParentMapUniqueKey: String = js.native
  }
  object SourceIndex {
    
    @scala.inline
    def apply(
      sourceIndex: Double,
      sourceParentMapUniqueKey: String,
      targetIndex: Double,
      targetParentMapUniqueKey: String
    ): SourceIndex = {
      val __obj = js.Dynamic.literal(sourceIndex = sourceIndex.asInstanceOf[js.Any], sourceParentMapUniqueKey = sourceParentMapUniqueKey.asInstanceOf[js.Any], targetIndex = targetIndex.asInstanceOf[js.Any], targetParentMapUniqueKey = targetParentMapUniqueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceIndex]
    }
    
    @scala.inline
    implicit class SourceIndexMutableBuilder[Self <: SourceIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSourceIndex(value: Double): Self = StObject.set(x, "sourceIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceParentMapUniqueKey(value: String): Self = StObject.set(x, "sourceParentMapUniqueKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetIndex(value: Double): Self = StObject.set(x, "targetIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetParentMapUniqueKey(value: String): Self = StObject.set(x, "targetParentMapUniqueKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UniqueKey extends StObject {
    
    // 唯一 key，用来实例化组件
    var uniqueKey: String = js.native
  }
  object UniqueKey {
    
    @scala.inline
    def apply(uniqueKey: String): UniqueKey = {
      val __obj = js.Dynamic.literal(uniqueKey = uniqueKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[UniqueKey]
    }
    
    @scala.inline
    implicit class UniqueKeyMutableBuilder[Self <: UniqueKey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUniqueKey(value: String): Self = StObject.set(x, "uniqueKey", value.asInstanceOf[js.Any])
    }
  }
}
