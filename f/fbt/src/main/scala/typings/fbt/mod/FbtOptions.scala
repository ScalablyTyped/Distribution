package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FbtOptions extends StObject {
  
  /**
    * Text author
    */
  var author: js.UndefOr[String] = js.undefined
  
  /**
    *  Use a "common" string repository
    *  To use the strings at runtime, there is the fbt.c(...) function call or the <fbt common=true>...</fbt> JSX API.
    *  NOTE: The transform will throw if it encounters a common string not in the map provided.
    *  See: https://facebook.github.io/fbt/docs/common#runtime-api
    */
  var common: js.UndefOr[Boolean] = js.undefined
  
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
object FbtOptions {
  
  inline def apply(): FbtOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FbtOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FbtOptions] (val x: Self) extends AnyVal {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCommon(value: Boolean): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
    
    inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
    
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
