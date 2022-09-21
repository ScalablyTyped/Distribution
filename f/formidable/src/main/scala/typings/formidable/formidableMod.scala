package typings.formidable

import typings.formidable.anon.PartialOptions
import typings.formidable.formidableStrings.data
import typings.formidable.formidableStrings.end_
import typings.formidable.formidableStrings.error
import typings.formidable.formidableStrings.field
import typings.formidable.formidableStrings.file
import typings.formidable.formidableStrings.fileBegin
import typings.formidable.formidableStrings.progress
import typings.formidable.mod.DefaultOptions
import typings.formidable.mod.EmitData
import typings.formidable.mod.EventData
import typings.formidable.mod.Fields
import typings.formidable.mod.File
import typings.formidable.mod.Files
import typings.formidable.mod.Part
import typings.formidable.mod.PluginFunction
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formidableMod {
  
  @JSImport("formidable/Formidable", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IncomingForm {
    def this(options: PartialOptions) = this()
  }
  
  /* static member */
  @JSImport("formidable/Formidable", "DEFAULT_OPTIONS")
  @js.native
  val DEFAULT_OPTIONS: DefaultOptions = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventEmitter * / any */ @js.native
  trait IncomingForm extends StObject {
    
    def _handlePart(part: Part): Unit = js.native
    
    @JSName("emit")
    def emit_data(eventName: data, data: EmitData): Boolean = js.native
    
    def on(eventName: fileBegin | file, listener: js.Function2[/* formName */ String, /* file */ File, Unit]): this.type = js.native
    def on(eventName: String, listener: js.Function0[Unit]): this.type = js.native
    
    /**
      * If you want to use Formidable to only handle certain parts for you, you can do something
      * similar. Or see #387 for inspiration, you can for example validate the mime-type.
      *
      * @link https://github.com/node-formidable/formidable#formonpart
      */
    def onPart(part: Part): Unit = js.native
    
    @JSName("on")
    def on_data(eventName: data, listener: js.Function1[/* data */ EventData, Unit]): this.type = js.native
    @JSName("on")
    def on_error(eventName: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    @JSName("on")
    def on_field(eventName: field, listener: js.Function2[/* name */ String, /* value */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_progress(
      eventName: progress,
      listener: js.Function2[/* bytesReceived */ Double, /* bytesExpected */ Double, Unit]
    ): this.type = js.native
    
    @JSName("once")
    def once_end(eventName: end_, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(eventName: error, listener: js.Function1[/* err */ Any, Unit]): this.type = js.native
    
    /**
      * Parses an incoming Node.js request containing form data. If callback is provided, all fields
      * and files are collected and passed to the callback.
      *
      * @link https://github.com/node-formidable/formidable#parserequest-callback
      */
    def parse(request: IncomingMessage): Unit = js.native
    def parse(
      request: IncomingMessage,
      callback: js.Function3[/* err */ Any, /* fields */ Fields, /* files */ Files, Unit]
    ): Unit = js.native
    
    /**
      * A method that allows you to extend the Formidable library. By default we include 4 plugins,
      * which essentially are adapters to plug the different built-in parsers.
      *
      * @link https://github.com/node-formidable/formidable#useplugin-plugin
      */
    def use(plugin: PluginFunction): Unit = js.native
  }
}
