package typings.gifffer

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @see {@link https://github.com/krasimir/gifffer#usage|Usage}
    */
  inline def apply(): js.Array[HTMLButtonElement] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[HTMLButtonElement]]
  inline def apply(options: GiffferOptions): js.Array[HTMLButtonElement] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[js.Array[HTMLButtonElement]]
  
  @JSImport("gifffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @see {@link https://github.com/krasimir/gifffer#styling|Styling}
    */
  trait GiffferOptions extends StObject {
    
    var playButtonIconStyles: StringDictionary[String]
    
    var playButtonStyles: StringDictionary[String]
  }
  object GiffferOptions {
    
    inline def apply(playButtonIconStyles: StringDictionary[String], playButtonStyles: StringDictionary[String]): GiffferOptions = {
      val __obj = js.Dynamic.literal(playButtonIconStyles = playButtonIconStyles.asInstanceOf[js.Any], playButtonStyles = playButtonStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiffferOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GiffferOptions] (val x: Self) extends AnyVal {
      
      inline def setPlayButtonIconStyles(value: StringDictionary[String]): Self = StObject.set(x, "playButtonIconStyles", value.asInstanceOf[js.Any])
      
      inline def setPlayButtonStyles(value: StringDictionary[String]): Self = StObject.set(x, "playButtonStyles", value.asInstanceOf[js.Any])
    }
  }
}
