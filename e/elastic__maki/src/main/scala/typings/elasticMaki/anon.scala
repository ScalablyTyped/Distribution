package typings.elasticMaki

import typings.elasticMaki.mod.IconName
import typings.elasticMaki.mod.SpriteSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `1` extends StObject {
    
    var `1`: SpriteSheet = js.native
    
    var `2`: SpriteSheet = js.native
    
    var `4`: SpriteSheet = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(`1`: SpriteSheet, `2`: SpriteSheet, `4`: SpriteSheet): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set1(value: SpriteSheet): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set2(value: SpriteSheet): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set4(value: SpriteSheet): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait All extends StObject {
    
    var all: js.Array[IconName] = js.native
  }
  object All {
    
    @scala.inline
    def apply(all: js.Array[IconName]): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.Array[IconName]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVarargs(value: IconName*): Self = StObject.set(x, "all", js.Array(value :_*))
    }
  }
}
