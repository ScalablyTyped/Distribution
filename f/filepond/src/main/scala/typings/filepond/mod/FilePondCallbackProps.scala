package typings.filepond.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePondCallbackProps extends StObject {
  
  /* Called when a file is clicked or tapped. **/
  var onactivatefile: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** If no error, file has been successfully loaded. */
  var onaddfile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Made progress loading a file. */
  var onaddfileprogress: js.UndefOr[js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit]] = js.undefined
  
  /** Started file load. */
  var onaddfilestart: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /**
    * FilePond instance throws an error. Optionally receives
    * file if error is related to a file object.
    */
  var onerror: js.UndefOr[
    js.Function3[
      /* error */ FilePondErrorDescription, 
      /* file */ js.UndefOr[FilePondFile], 
      /* status */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  /** FilePond instance has been created and is ready. */
  var oninit: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * File has been transformed by the transform plugin or
    * another plugin subscribing to the prepare_output filter.
    * It receives the file item and the output data.
    */
  var onpreparefile: js.UndefOr[js.Function2[/* file */ FilePondFile, /* output */ js.Any, Unit]] = js.undefined
  
  /** If no error, Processing of a file has been completed. */
  var onprocessfile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Aborted processing of a file. */
  var onprocessfileabort: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** Made progress processing a file. */
  var onprocessfileprogress: js.UndefOr[js.Function2[/* file */ FilePondFile, /* progress */ Double, Unit]] = js.undefined
  
  /** Processing of a file has been reverted. */
  var onprocessfilerevert: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** Called when all files in the list have been processed. */
  var onprocessfiles: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /** Started processing a file. */
  var onprocessfilestart: js.UndefOr[js.Function1[/* file */ FilePondFile, Unit]] = js.undefined
  
  /** File has been removed. */
  var onremovefile: js.UndefOr[
    js.Function2[/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile, Unit]
  ] = js.undefined
  
  /** Called when the files have been reordered */
  var onreorderfiles: js.UndefOr[js.Function1[/* files */ js.Array[FilePondFile], Unit]] = js.undefined
  
  /** A file has been added or removed, receives a list of file items. */
  var onupdatefiles: js.UndefOr[js.Function1[/* files */ js.Array[FilePondFile], Unit]] = js.undefined
  
  /**
    * FilePond instance throws a warning. For instance
    * when the maximum amount of files has been reached.
    * Optionally receives file if error is related to a
    * file object.
    */
  var onwarning: js.UndefOr[
    js.Function3[
      /* error */ js.Any, 
      /* file */ js.UndefOr[FilePondFile], 
      /* status */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
}
object FilePondCallbackProps {
  
  @scala.inline
  def apply(): FilePondCallbackProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondCallbackProps]
  }
  
  @scala.inline
  implicit class FilePondCallbackPropsMutableBuilder[Self <: FilePondCallbackProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnactivatefile(value: /* file */ FilePondFile => Unit): Self = StObject.set(x, "onactivatefile", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnactivatefileUndefined: Self = StObject.set(x, "onactivatefile", js.undefined)
    
    @scala.inline
    def setOnaddfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): Self = StObject.set(x, "onaddfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnaddfileUndefined: Self = StObject.set(x, "onaddfile", js.undefined)
    
    @scala.inline
    def setOnaddfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Unit): Self = StObject.set(x, "onaddfileprogress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnaddfileprogressUndefined: Self = StObject.set(x, "onaddfileprogress", js.undefined)
    
    @scala.inline
    def setOnaddfilestart(value: /* file */ FilePondFile => Unit): Self = StObject.set(x, "onaddfilestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnaddfilestartUndefined: Self = StObject.set(x, "onaddfilestart", js.undefined)
    
    @scala.inline
    def setOnerror(
      value: (/* error */ FilePondErrorDescription, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onerror", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnerrorUndefined: Self = StObject.set(x, "onerror", js.undefined)
    
    @scala.inline
    def setOninit(value: () => Unit): Self = StObject.set(x, "oninit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    @scala.inline
    def setOnpreparefile(value: (/* file */ FilePondFile, /* output */ js.Any) => Unit): Self = StObject.set(x, "onpreparefile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnpreparefileUndefined: Self = StObject.set(x, "onpreparefile", js.undefined)
    
    @scala.inline
    def setOnprocessfile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): Self = StObject.set(x, "onprocessfile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnprocessfileUndefined: Self = StObject.set(x, "onprocessfile", js.undefined)
    
    @scala.inline
    def setOnprocessfileabort(value: /* file */ FilePondFile => Unit): Self = StObject.set(x, "onprocessfileabort", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnprocessfileabortUndefined: Self = StObject.set(x, "onprocessfileabort", js.undefined)
    
    @scala.inline
    def setOnprocessfileprogress(value: (/* file */ FilePondFile, /* progress */ Double) => Unit): Self = StObject.set(x, "onprocessfileprogress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnprocessfileprogressUndefined: Self = StObject.set(x, "onprocessfileprogress", js.undefined)
    
    @scala.inline
    def setOnprocessfilerevert(value: /* file */ FilePondFile => Unit): Self = StObject.set(x, "onprocessfilerevert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnprocessfilerevertUndefined: Self = StObject.set(x, "onprocessfilerevert", js.undefined)
    
    @scala.inline
    def setOnprocessfiles(value: () => Unit): Self = StObject.set(x, "onprocessfiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnprocessfilesUndefined: Self = StObject.set(x, "onprocessfiles", js.undefined)
    
    @scala.inline
    def setOnprocessfilestart(value: /* file */ FilePondFile => Unit): Self = StObject.set(x, "onprocessfilestart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnprocessfilestartUndefined: Self = StObject.set(x, "onprocessfilestart", js.undefined)
    
    @scala.inline
    def setOnremovefile(value: (/* error */ FilePondErrorDescription | Null, /* file */ FilePondFile) => Unit): Self = StObject.set(x, "onremovefile", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnremovefileUndefined: Self = StObject.set(x, "onremovefile", js.undefined)
    
    @scala.inline
    def setOnreorderfiles(value: /* files */ js.Array[FilePondFile] => Unit): Self = StObject.set(x, "onreorderfiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnreorderfilesUndefined: Self = StObject.set(x, "onreorderfiles", js.undefined)
    
    @scala.inline
    def setOnupdatefiles(value: /* files */ js.Array[FilePondFile] => Unit): Self = StObject.set(x, "onupdatefiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnupdatefilesUndefined: Self = StObject.set(x, "onupdatefiles", js.undefined)
    
    @scala.inline
    def setOnwarning(
      value: (/* error */ js.Any, /* file */ js.UndefOr[FilePondFile], /* status */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "onwarning", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnwarningUndefined: Self = StObject.set(x, "onwarning", js.undefined)
  }
}
