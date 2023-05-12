package typings.gauge

import typings.gauge.libThemesMod.ThemeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActivityIndicatorTheme extends StObject {
    
    /**
      * The theme for the activity indicator (spinner), this can either be a
      * string, in which each character is a different step, or an array of
      * strings.
      */
    var activityIndicatorTheme: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * displayed after the progress bar, if the progress bar is displayed.
      */
    var postProgressbar: js.UndefOr[String] = js.undefined
    
    /**
      * displayed prior to the progress bar, if the progress bar is displayed.
      */
    var preProgressbar: js.UndefOr[String] = js.undefined
    
    /**
      * displayed as a separator between the `section` and `subsection` when the latter
      * is printed.
      */
    var preSubsection: js.UndefOr[String] = js.undefined
    
    /**
      * The subtheme passed through to the progress bar renderer, it's an object
      * with `complete` and `remaining` properties that are the strings you want
      * repeated for those sections of the progress bar.
      */
    var progressbarTheme: js.UndefOr[Complete] = js.undefined
  }
  object ActivityIndicatorTheme {
    
    inline def apply(): ActivityIndicatorTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivityIndicatorTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActivityIndicatorTheme] (val x: Self) extends AnyVal {
      
      inline def setActivityIndicatorTheme(value: String | js.Array[String]): Self = StObject.set(x, "activityIndicatorTheme", value.asInstanceOf[js.Any])
      
      inline def setActivityIndicatorThemeUndefined: Self = StObject.set(x, "activityIndicatorTheme", js.undefined)
      
      inline def setActivityIndicatorThemeVarargs(value: String*): Self = StObject.set(x, "activityIndicatorTheme", js.Array(value*))
      
      inline def setPostProgressbar(value: String): Self = StObject.set(x, "postProgressbar", value.asInstanceOf[js.Any])
      
      inline def setPostProgressbarUndefined: Self = StObject.set(x, "postProgressbar", js.undefined)
      
      inline def setPreProgressbar(value: String): Self = StObject.set(x, "preProgressbar", value.asInstanceOf[js.Any])
      
      inline def setPreProgressbarUndefined: Self = StObject.set(x, "preProgressbar", js.undefined)
      
      inline def setPreSubsection(value: String): Self = StObject.set(x, "preSubsection", value.asInstanceOf[js.Any])
      
      inline def setPreSubsectionUndefined: Self = StObject.set(x, "preSubsection", js.undefined)
      
      inline def setProgressbarTheme(value: Complete): Self = StObject.set(x, "progressbarTheme", value.asInstanceOf[js.Any])
      
      inline def setProgressbarThemeUndefined: Self = StObject.set(x, "progressbarTheme", js.undefined)
    }
  }
  
  trait Complete extends StObject {
    
    var complete: js.UndefOr[String] = js.undefined
    
    var postComplete: js.UndefOr[String] = js.undefined
    
    var postRemaining: js.UndefOr[String] = js.undefined
    
    var preComplete: js.UndefOr[String] = js.undefined
    
    var preRemaining: js.UndefOr[String] = js.undefined
    
    var remaining: js.UndefOr[String] = js.undefined
  }
  object Complete {
    
    inline def apply(): Complete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Complete]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Complete] (val x: Self) extends AnyVal {
      
      inline def setComplete(value: String): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setPostComplete(value: String): Self = StObject.set(x, "postComplete", value.asInstanceOf[js.Any])
      
      inline def setPostCompleteUndefined: Self = StObject.set(x, "postComplete", js.undefined)
      
      inline def setPostRemaining(value: String): Self = StObject.set(x, "postRemaining", value.asInstanceOf[js.Any])
      
      inline def setPostRemainingUndefined: Self = StObject.set(x, "postRemaining", js.undefined)
      
      inline def setPreComplete(value: String): Self = StObject.set(x, "preComplete", value.asInstanceOf[js.Any])
      
      inline def setPreCompleteUndefined: Self = StObject.set(x, "preComplete", js.undefined)
      
      inline def setPreRemaining(value: String): Self = StObject.set(x, "preRemaining", value.asInstanceOf[js.Any])
      
      inline def setPreRemainingUndefined: Self = StObject.set(x, "preRemaining", js.undefined)
      
      inline def setRemaining(value: String): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRemainingUndefined: Self = StObject.set(x, "remaining", js.undefined)
    }
  }
  
  trait Darwin extends StObject {
    
    var darwin: RecordtruefalseThemeObjec
    
    var fallback: RecordtruefalseThemeObjec
    
    var linux: RecordtruefalseThemeObjec
  }
  object Darwin {
    
    inline def apply(
      darwin: RecordtruefalseThemeObjec,
      fallback: RecordtruefalseThemeObjec,
      linux: RecordtruefalseThemeObjec
    ): Darwin = {
      val __obj = js.Dynamic.literal(darwin = darwin.asInstanceOf[js.Any], fallback = fallback.asInstanceOf[js.Any], linux = linux.asInstanceOf[js.Any])
      __obj.asInstanceOf[Darwin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Darwin] (val x: Self) extends AnyVal {
      
      inline def setDarwin(value: RecordtruefalseThemeObjec): Self = StObject.set(x, "darwin", value.asInstanceOf[js.Any])
      
      inline def setFallback(value: RecordtruefalseThemeObjec): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setLinux(value: RecordtruefalseThemeObjec): Self = StObject.set(x, "linux", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'true' | 'false', gauge.gauge/lib/themes.ThemeObject> */
  trait RecordtruefalseThemeObjec extends StObject {
    
    var `false`: ThemeObject
    
    var `true`: ThemeObject
  }
  object RecordtruefalseThemeObjec {
    
    inline def apply(`false`: ThemeObject, `true`: ThemeObject): RecordtruefalseThemeObjec = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("false")(`false`.asInstanceOf[js.Any])
      __obj.updateDynamic("true")(`true`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecordtruefalseThemeObjec]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RecordtruefalseThemeObjec] (val x: Self) extends AnyVal {
      
      inline def setFalse(value: ThemeObject): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
      
      inline def setTrue(value: ThemeObject): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    }
  }
}
