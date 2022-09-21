package typings.fbt

import org.scalablytyped.runtime.StringDictionary
import typings.fbt.fbtBooleans.`true`
import typings.fbt.fbtStrings.ifMany
import typings.fbt.fbtStrings.no
import typings.fbt.fbtStrings.yes
import typings.fbt.mod.FbtHookRegistrations
import typings.fbt.mod.GenderConst
import typings.fbt.mod.IntlVariationsGender
import typings.fbt.mod.PronounType
import typings.fbt.mod.TranslationDict
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Hooks extends StObject {
    
    var hooks: js.UndefOr[FbtHookRegistrations] = js.undefined
    
    var translations: TranslationDict
  }
  object Hooks {
    
    inline def apply(translations: TranslationDict): Hooks = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hooks]
    }
    
    extension [Self <: Hooks](x: Self) {
      
      inline def setHooks(value: FbtHookRegistrations): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
      
      inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
      
      inline def setTranslations(value: TranslationDict): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtEnumProps> */
  trait PropsWithChildrenFbtEnumP extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var `enum-range`: js.Array[String] | StringDictionary[String]
    
    var value: String
  }
  object PropsWithChildrenFbtEnumP {
    
    inline def apply(`enum-range`: js.Array[String] | StringDictionary[String], value: String): PropsWithChildrenFbtEnumP = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("enum-range")(`enum-range`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtEnumP]
    }
    
    extension [Self <: PropsWithChildrenFbtEnumP](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def `setEnum-range`(value: js.Array[String] | StringDictionary[String]): Self = StObject.set(x, "enum-range", value.asInstanceOf[js.Any])
      
      inline def `setEnum-rangeVarargs`(value: String*): Self = StObject.set(x, "enum-range", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtNameProps> */
  trait PropsWithChildrenFbtNameP extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var gender: IntlVariationsGender
    
    var name: String
  }
  object PropsWithChildrenFbtNameP {
    
    inline def apply(gender: IntlVariationsGender, name: String): PropsWithChildrenFbtNameP = {
      val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtNameP]
    }
    
    extension [Self <: PropsWithChildrenFbtNameP](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGender(value: IntlVariationsGender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtParamProps> */
  trait PropsWithChildrenFbtParam extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * `IntlVariations.GENDER_*` Pass the gender of the parameter for correctly variated text.
      */
    var gender: js.UndefOr[IntlVariationsGender] = js.undefined
    
    var name: String
    
    /**
      * Passing a value of type `number` into the `number` option uses that value as the input for which we determine the [CLDR plural value](http://cldr.unicode.org/index/cldr-spec/plural-rules).
      * You can pass `true` to simply use the parameter value (the same value that replaces the token).
      */
    var number: js.UndefOr[Double | `true`] = js.undefined
  }
  object PropsWithChildrenFbtParam {
    
    inline def apply(name: String): PropsWithChildrenFbtParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtParam]
    }
    
    extension [Self <: PropsWithChildrenFbtParam](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGender(value: IntlVariationsGender): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: Double | `true`): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtPluralProps> */
  trait PropsWithChildrenFbtPlura extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var count: Double
    
    /**
      * Represents the plural form of the string in English. Default is `{singular} + 's'`
      */
    var many: js.UndefOr[String] = js.undefined
    
    /**
      * Name of the token where count shows up. (Default: `"number"`)
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * `"yes"|"no"|"ifMany"`: Whether to show the `{number}` in the string.
      *
      * > Note that the singular phrase never has a token, but inlines to `1`.
      * ? This is to account for languages like Hebrew for which showing the actual number isn't appropriate
      *
      *  - "no": (DEFAULT) Don't show the count
      *  - "ifMany": Show the count only in plural case
      *  - "yes": Show the count in all cases
      */
    var showCount: js.UndefOr[yes | no | ifMany] = js.undefined
    
    /**
      * For overriding the displayed number
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object PropsWithChildrenFbtPlura {
    
    inline def apply(count: Double): PropsWithChildrenFbtPlura = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtPlura]
    }
    
    extension [Self <: PropsWithChildrenFbtPlura](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMany(value: String): Self = StObject.set(x, "many", value.asInstanceOf[js.Any])
      
      inline def setManyUndefined: Self = StObject.set(x, "many", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShowCount(value: yes | no | ifMany): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      inline def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtPronounProps> */
  trait PropsWithChildrenFbtProno extends StObject {
    
    /**
      * Whether to capitalize the pronoun in the source string.
      */
    var capitalize: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var gender: GenderConst
    
    /**
      * Whether to elide the NOT_A_PERSON option in the text variations generated.
      */
    var human: js.UndefOr[Boolean] = js.undefined
    
    var `type`: PronounType
  }
  object PropsWithChildrenFbtProno {
    
    inline def apply(gender: GenderConst, `type`: PronounType): PropsWithChildrenFbtProno = {
      val __obj = js.Dynamic.literal(gender = gender.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtProno]
    }
    
    extension [Self <: PropsWithChildrenFbtProno](x: Self) {
      
      inline def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
      
      inline def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setGender(value: GenderConst): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
      
      inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
      
      inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
      
      inline def setType(value: PronounType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtProps> */
  trait PropsWithChildrenFbtProps extends StObject {
    
    /**
      * Text author
      */
    var author: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      *  Use a "common" string repository
      *  To use the strings at runtime, there is the fbt.c(...) function call or the <fbt common=true>...</fbt> JSX API.
      *  NOTE: The transform will throw if it encounters a common string not in the map provided.
      *  See: https://facebook.github.io/fbt/docs/common#runtime-api
      */
    var common: js.UndefOr[Boolean] = js.undefined
    
    var desc: String
    
    /**
      *  Informs [collection](https://facebook.github.io/fbt/docs/collection/) to skip this string (useful for tests/mocks)
      */
    var doNotExtract: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  (Default: false) FBT normally consolidates whitespace down to one space (' '). Turn this off by setting this to true
      */
    var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Project to which the text belongs
      */
    var project: js.UndefOr[String] = js.undefined
    
    /**
      * IntlVariations.GENDER_*: Pass an [implicit subject](https://facebook.github.io/fbt/docs/implicit_params/) gender to a partially formed text
      */
    var subject: js.UndefOr[IntlVariationsGender] = js.undefined
  }
  object PropsWithChildrenFbtProps {
    
    inline def apply(desc: String): PropsWithChildrenFbtProps = {
      val __obj = js.Dynamic.literal(desc = desc.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtProps]
    }
    
    extension [Self <: PropsWithChildrenFbtProps](x: Self) {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setCommon(value: Boolean): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
      
      inline def setDoNotExtract(value: Boolean): Self = StObject.set(x, "doNotExtract", value.asInstanceOf[js.Any])
      
      inline def setDoNotExtractUndefined: Self = StObject.set(x, "doNotExtract", js.undefined)
      
      inline def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
      
      inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
      
      inline def setSubject(value: IntlVariationsGender): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  /* Inlined fbt.fbt.<global>.JSX.PropsWithChildren<fbt.fbt.FbtSameParamProps> */
  trait PropsWithChildrenFbtSameP extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var name: String
  }
  object PropsWithChildrenFbtSameP {
    
    inline def apply(name: String): PropsWithChildrenFbtSameP = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[PropsWithChildrenFbtSameP]
    }
    
    extension [Self <: PropsWithChildrenFbtSameP](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Validated extends StObject {
    
    var validated: Boolean
  }
  object Validated {
    
    inline def apply(validated: Boolean): Validated = {
      val __obj = js.Dynamic.literal(validated = validated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Validated]
    }
    
    extension [Self <: Validated](x: Self) {
      
      inline def setValidated(value: Boolean): Self = StObject.set(x, "validated", value.asInstanceOf[js.Any])
    }
  }
}
