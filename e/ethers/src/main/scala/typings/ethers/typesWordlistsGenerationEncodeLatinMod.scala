package typings.ethers

import typings.ethers.anon.Accents
import typings.ethers.anon.Subs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesWordlistsGenerationEncodeLatinMod {
  
  @JSImport("ethers/types/wordlists/generation/encode-latin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ethers/types/wordlists/generation/encode-latin", "BitWriter")
  @js.native
  open class BitWriter protected () extends StObject {
    def this(width: Double) = this()
    
    def data: String = js.native
    
    def length: Double = js.native
    
    /* private */ var `private`: Any = js.native
    
    val width: Double = js.native
    
    def write(value: Double): Unit = js.native
  }
  
  inline def encodeOwl(words: js.Array[String]): Subs = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeOwl")(words.asInstanceOf[js.Any]).asInstanceOf[Subs]
  
  inline def extractAccents(words: js.Array[String]): Accents = ^.asInstanceOf[js.Dynamic].applyDynamic("extractAccents")(words.asInstanceOf[js.Any]).asInstanceOf[Accents]
  
  trait AccentSet extends StObject {
    
    var accent: Double
    
    var follows: String
    
    var positionData: String
    
    var positionDataLength: Double
    
    var positions: js.Array[Double]
    
    var positionsLength: Double
  }
  object AccentSet {
    
    inline def apply(
      accent: Double,
      follows: String,
      positionData: String,
      positionDataLength: Double,
      positions: js.Array[Double],
      positionsLength: Double
    ): AccentSet = {
      val __obj = js.Dynamic.literal(accent = accent.asInstanceOf[js.Any], follows = follows.asInstanceOf[js.Any], positionData = positionData.asInstanceOf[js.Any], positionDataLength = positionDataLength.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], positionsLength = positionsLength.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccentSet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccentSet] (val x: Self) extends AnyVal {
      
      inline def setAccent(value: Double): Self = StObject.set(x, "accent", value.asInstanceOf[js.Any])
      
      inline def setFollows(value: String): Self = StObject.set(x, "follows", value.asInstanceOf[js.Any])
      
      inline def setPositionData(value: String): Self = StObject.set(x, "positionData", value.asInstanceOf[js.Any])
      
      inline def setPositionDataLength(value: Double): Self = StObject.set(x, "positionDataLength", value.asInstanceOf[js.Any])
      
      inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
      
      inline def setPositionsLength(value: Double): Self = StObject.set(x, "positionsLength", value.asInstanceOf[js.Any])
      
      inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
    }
  }
}
