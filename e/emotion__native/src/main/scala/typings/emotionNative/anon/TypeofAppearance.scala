package typings.emotionNative.anon

import typings.reactNative.mod.Appearance.AppearanceListener
import typings.reactNative.mod.ColorSchemeName
import typings.reactNative.mod.NativeEventSubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofAppearance extends StObject {
  
  def addChangeListener(listener: AppearanceListener): NativeEventSubscription
  
  def getColorScheme(): ColorSchemeName
}
object TypeofAppearance {
  
  inline def apply(
    addChangeListener: AppearanceListener => NativeEventSubscription,
    getColorScheme: () => ColorSchemeName
  ): TypeofAppearance = {
    val __obj = js.Dynamic.literal(addChangeListener = js.Any.fromFunction1(addChangeListener), getColorScheme = js.Any.fromFunction0(getColorScheme))
    __obj.asInstanceOf[TypeofAppearance]
  }
  
  extension [Self <: TypeofAppearance](x: Self) {
    
    inline def setAddChangeListener(value: AppearanceListener => NativeEventSubscription): Self = StObject.set(x, "addChangeListener", js.Any.fromFunction1(value))
    
    inline def setGetColorScheme(value: () => ColorSchemeName): Self = StObject.set(x, "getColorScheme", js.Any.fromFunction0(value))
  }
}
