package typings.fastGlob

import typings.fastGlob.outSettingsMod.default
import typings.fastGlob.outTypesMod.Pattern
import typings.fastGlob.outTypesMod.PatternsGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outManagersTasksMod {
  
  @JSImport("fast-glob/out/managers/tasks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertPatternGroupToTask(base: String, positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): Task = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternGroupToTask")(base.asInstanceOf[js.Any], positive.asInstanceOf[js.Any], negative.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[Task]
  
  inline def convertPatternGroupsToTasks(positive: PatternsGroup, negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternGroupsToTasks")(positive.asInstanceOf[js.Any], negative.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[js.Array[Task]]
  
  inline def convertPatternsToTasks(positive: js.Array[Pattern], negative: js.Array[Pattern], dynamic: Boolean): js.Array[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("convertPatternsToTasks")(positive.asInstanceOf[js.Any], negative.asInstanceOf[js.Any], dynamic.asInstanceOf[js.Any])).asInstanceOf[js.Array[Task]]
  
  inline def generate(patterns: js.Array[Pattern], settings: default): js.Array[Task] = (^.asInstanceOf[js.Dynamic].applyDynamic("generate")(patterns.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[js.Array[Task]]
  
  inline def getNegativePatternsAsPositive(patterns: js.Array[Pattern], ignore: js.Array[Pattern]): js.Array[Pattern] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNegativePatternsAsPositive")(patterns.asInstanceOf[js.Any], ignore.asInstanceOf[js.Any])).asInstanceOf[js.Array[Pattern]]
  
  inline def getPositivePatterns(patterns: js.Array[Pattern]): js.Array[Pattern] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPositivePatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[Pattern]]
  
  inline def groupPatternsByBaseDirectory(patterns: js.Array[Pattern]): PatternsGroup = ^.asInstanceOf[js.Dynamic].applyDynamic("groupPatternsByBaseDirectory")(patterns.asInstanceOf[js.Any]).asInstanceOf[PatternsGroup]
  
  trait Task extends StObject {
    
    var base: String
    
    var dynamic: Boolean
    
    var negative: js.Array[Pattern]
    
    var patterns: js.Array[Pattern]
    
    var positive: js.Array[Pattern]
  }
  object Task {
    
    inline def apply(
      base: String,
      dynamic: Boolean,
      negative: js.Array[Pattern],
      patterns: js.Array[Pattern],
      positive: js.Array[Pattern]
    ): Task = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDynamic(value: Boolean): Self = StObject.set(x, "dynamic", value.asInstanceOf[js.Any])
      
      inline def setNegative(value: js.Array[Pattern]): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
      
      inline def setNegativeVarargs(value: Pattern*): Self = StObject.set(x, "negative", js.Array(value*))
      
      inline def setPatterns(value: js.Array[Pattern]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: Pattern*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setPositive(value: js.Array[Pattern]): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
      
      inline def setPositiveVarargs(value: Pattern*): Self = StObject.set(x, "positive", js.Array(value*))
    }
  }
}
