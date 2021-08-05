package typings.elasticMaki

import typings.elasticMaki.mod.IconName
import typings.elasticMaki.mod.SpriteSheet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `1` extends StObject {
    
    var `1`: SpriteSheet
    
    var `2`: SpriteSheet
    
    var `4`: SpriteSheet
  }
  object `1` {
    
    inline def apply(`1`: SpriteSheet, `2`: SpriteSheet, `4`: SpriteSheet): `1` = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
      __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
      __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def set1(value: SpriteSheet): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
      
      inline def set2(value: SpriteSheet): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
      
      inline def set4(value: SpriteSheet): Self = StObject.set(x, "4", value.asInstanceOf[js.Any])
    }
  }
  
  trait All extends StObject {
    
    var all: js.Array[IconName]
  }
  object All {
    
    inline def apply(all: js.Array[IconName]): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    extension [Self <: All](x: Self) {
      
      inline def setAll(value: js.Array[IconName]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllVarargs(value: IconName*): Self = StObject.set(x, "all", js.Array(value :_*))
    }
  }
}
