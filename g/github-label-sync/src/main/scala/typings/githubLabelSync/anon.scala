package typings.githubLabelSync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Diff extends StObject {
    
    var diff: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
    
    var success: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
    
    var warning: js.UndefOr[js.Function1[/* str */ String, String]] = js.native
  }
  object Diff {
    
    @scala.inline
    def apply(): Diff = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Diff]
    }
    
    @scala.inline
    implicit class DiffMutableBuilder[Self <: Diff] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiff(value: /* str */ String => String): Self = StObject.set(x, "diff", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      @scala.inline
      def setSuccess(value: /* str */ String => String): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      @scala.inline
      def setWarning(value: /* str */ String => String): Self = StObject.set(x, "warning", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  @js.native
  trait Info extends StObject {
    
    var info: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
    
    var warn: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.native
  }
  object Info {
    
    @scala.inline
    def apply(): Info = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit class InfoMutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInfo(value: /* str */ String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      @scala.inline
      def setWarn(value: /* str */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
    }
  }
}
