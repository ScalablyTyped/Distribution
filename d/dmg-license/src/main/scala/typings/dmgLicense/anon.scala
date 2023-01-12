package typings.dmgLicense

import typings.dmgLicense.dmgLicenseStrings.TEXT
import typings.dmgLicense.dmgLicenseStrings.`RTF `
import typings.dmgLicense.libLanguageMod.Language
import typings.dmgLicense.libLanguageMod.Localization
import typings.node.bufferMod.global.Buffer
import typings.plist.mod.PlistObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[U] extends StObject {
    
    def onNoLanguageName(): js.Promise[U]
  }
  object `0` {
    
    inline def apply[U](onNoLanguageName: () => js.Promise[U]): `0`[U] = {
      val __obj = js.Dynamic.literal(onNoLanguageName = js.Any.fromFunction0(onNoLanguageName))
      __obj.asInstanceOf[`0`[U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`[?], U] (val x: Self & `0`[U]) extends AnyVal {
      
      inline def setOnNoLanguageName(value: () => js.Promise[U]): Self = StObject.set(x, "onNoLanguageName", js.Any.fromFunction0(value))
    }
  }
  
  trait `1`[U] extends StObject {
    
    def onNoLanguageName(): U
  }
  object `1` {
    
    inline def apply[U](onNoLanguageName: () => U): `1`[U] = {
      val __obj = js.Dynamic.literal(onNoLanguageName = js.Any.fromFunction0(onNoLanguageName))
      __obj.asInstanceOf[`1`[U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`[?], U] (val x: Self & `1`[U]) extends AnyVal {
      
      inline def setOnNoLanguageName(value: () => U): Self = StObject.set(x, "onNoLanguageName", js.Any.fromFunction0(value))
    }
  }
  
  trait `2`[T /* <: Localization */, U] extends StObject {
    
    def map(`object`: T, lang: Language): U
  }
  object `2` {
    
    inline def apply[T /* <: Localization */, U](map: (T, Language) => U): `2`[T, U] = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction2(map))
      __obj.asInstanceOf[`2`[T, U]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`[?, ?], T /* <: Localization */, U] (val x: Self & (`2`[T, U])) extends AnyVal {
      
      inline def setMap(value: (T, Language) => U): Self = StObject.set(x, "map", js.Any.fromFunction2(value))
    }
  }
  
  /* Inlined dmg-license.dmg-license/lib/Labels.Labels.CreateOptions & {  includeLanguageName :true} */
  trait CreateOptionsincludeLangu extends StObject {
    
    var includeLanguageName: js.UndefOr[Boolean] = js.undefined
  }
  object CreateOptionsincludeLangu {
    
    inline def apply(): CreateOptionsincludeLangu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptionsincludeLangu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOptionsincludeLangu] (val x: Self) extends AnyVal {
      
      inline def setIncludeLanguageName(value: Boolean): Self = StObject.set(x, "includeLanguageName", value.asInstanceOf[js.Any])
      
      inline def setIncludeLanguageNameUndefined: Self = StObject.set(x, "includeLanguageName", js.undefined)
    }
  }
  
  /* Inlined dmg-license.dmg-license/lib/Labels.Labels.CreateOptions & {  includeLanguageName :false | undefined} */
  trait CreateOptionsincludeLanguIncludeLanguageName extends StObject {
    
    var includeLanguageName: js.UndefOr[Boolean] = js.undefined
  }
  object CreateOptionsincludeLanguIncludeLanguageName {
    
    inline def apply(): CreateOptionsincludeLanguIncludeLanguageName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateOptionsincludeLanguIncludeLanguageName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateOptionsincludeLanguIncludeLanguageName] (val x: Self) extends AnyVal {
      
      inline def setIncludeLanguageName(value: Boolean): Self = StObject.set(x, "includeLanguageName", value.asInstanceOf[js.Any])
      
      inline def setIncludeLanguageNameUndefined: Self = StObject.set(x, "includeLanguageName", js.undefined)
    }
  }
  
  trait Data extends StObject {
    
    var data: Buffer
    
    var `type`: (`RTF `) | TEXT
  }
  object Data {
    
    inline def apply(data: Buffer, `type`: (`RTF `) | TEXT): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: (`RTF `) | TEXT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Map extends StObject {
    
    var map: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait OnNoLanguageName extends StObject {
    
    var onNoLanguageName: js.UndefOr[scala.Nothing] = js.undefined
  }
  
  trait Plist extends StObject {
    
    var plist: PlistObject
    
    var plistText: String
  }
  object Plist {
    
    inline def apply(plist: PlistObject, plistText: String): Plist = {
      val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any], plistText = plistText.asInstanceOf[js.Any])
      __obj.asInstanceOf[Plist]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Plist] (val x: Self) extends AnyVal {
      
      inline def setPlist(value: PlistObject): Self = StObject.set(x, "plist", value.asInstanceOf[js.Any])
      
      inline def setPlistText(value: String): Self = StObject.set(x, "plistText", value.asInstanceOf[js.Any])
    }
  }
}
