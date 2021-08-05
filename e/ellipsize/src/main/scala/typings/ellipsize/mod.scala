package typings.ellipsize

import typings.ellipsize.anon.Chars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(/**
    * text to ellipsize.
    */
  text: String): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: String,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: String,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double,
    /**
    * additional options to customize the result and rules
    */
  options: Chars
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: String,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Unit,
    /**
    * additional options to customize the result and rules
    */
  options: Chars
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: Unit,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: Unit,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Double,
    /**
    * additional options to customize the result and rules
    */
  options: Chars
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(
    /**
    * text to ellipsize.
    */
  text: Unit,
    /**
    * maxLength of the text before it is ellipsized (default: 140)
    */
  maxLength: Unit,
    /**
    * additional options to customize the result and rules
    */
  options: Chars
  ): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], maxLength.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("ellipsize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
