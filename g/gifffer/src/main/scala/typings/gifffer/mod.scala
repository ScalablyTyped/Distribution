package typings.gifffer

import org.scalablytyped.runtime.StringDictionary
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @see {@link https://github.com/krasimir/gifffer#usage|Usage}
    */
  @JSImport("gifffer", JSImport.Namespace)
  @js.native
  def apply(): js.Array[HTMLButtonElement] = js.native
  @JSImport("gifffer", JSImport.Namespace)
  @js.native
  def apply(options: GiffferOptions): js.Array[HTMLButtonElement] = js.native
  
  /**
    * @see {@link https://github.com/krasimir/gifffer#styling|Styling}
    */
  @js.native
  trait GiffferOptions extends StObject {
    
    var playButtonIconStyles: StringDictionary[String] = js.native
    
    var playButtonStyles: StringDictionary[String] = js.native
  }
  object GiffferOptions {
    
    @scala.inline
    def apply(playButtonIconStyles: StringDictionary[String], playButtonStyles: StringDictionary[String]): GiffferOptions = {
      val __obj = js.Dynamic.literal(playButtonIconStyles = playButtonIconStyles.asInstanceOf[js.Any], playButtonStyles = playButtonStyles.asInstanceOf[js.Any])
      __obj.asInstanceOf[GiffferOptions]
    }
    
    @scala.inline
    implicit class GiffferOptionsMutableBuilder[Self <: GiffferOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPlayButtonIconStyles(value: StringDictionary[String]): Self = StObject.set(x, "playButtonIconStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlayButtonStyles(value: StringDictionary[String]): Self = StObject.set(x, "playButtonStyles", value.asInstanceOf[js.Any])
    }
  }
}
