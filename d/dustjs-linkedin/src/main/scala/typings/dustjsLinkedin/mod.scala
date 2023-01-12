package typings.dustjsLinkedin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dustjs-linkedin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compile(source: String, name: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def compile(source: String, name: String, strip: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any], strip.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def compileFn(source: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("compileFn")(source.asInstanceOf[js.Any]).asInstanceOf[Template]
  inline def compileFn(source: String, name: String): Template = (^.asInstanceOf[js.Dynamic].applyDynamic("compileFn")(source.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Template]
  
  inline def escapeHtml(html: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeHtml")(html.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def escapeJs(js_ : String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeJs")(js_.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def loadSource(compiled: String): Template = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSource")(compiled.asInstanceOf[js.Any]).asInstanceOf[Template]
  
  inline def makeBase(global: Any): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBase")(global.asInstanceOf[js.Any]).asInstanceOf[Context]
  inline def makeBase(global: Context): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("makeBase")(global.asInstanceOf[js.Any]).asInstanceOf[Context]
  
  inline def register(name: String, tmpl: Template): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("register")(name.asInstanceOf[js.Any], tmpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def render(name: String, context: Any, callback: js.Function2[/* err */ Any, /* out */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def render(name: String, context: Context, callback: js.Function2[/* err */ Any, /* out */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("render")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def renderSource(source: String, context: Any): Stream_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Stream_]
  inline def renderSource(source: String, context: Any, callback: js.Function2[/* err */ Any, /* out */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderSource(source: String, context: Context): Stream_ = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Stream_]
  inline def renderSource(source: String, context: Context, callback: js.Function2[/* err */ Any, /* out */ String, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSource")(source.asInstanceOf[js.Any], context.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stream(name: String, context: Any): Stream_ = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Stream_]
  inline def stream(name: String, context: Context): Stream_ = (^.asInstanceOf[js.Dynamic].applyDynamic("stream")(name.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Stream_]
  
  trait Chunk extends StObject {
    
    /**
      * Writes data to this chunk's buffer and marks it as flushable. This method must be called on any chunks created via chunk.map. Do not call this method on a handler's main chunk -- dust.render and dust.stream take care of this for you.
      */
    def end(data: String): Chunk
    
    /**
      * Creates a new chunk and passes it to callback. Use map to wrap asynchronous functions and to partition the template for streaming.
      */
    def map(callback: js.Function1[/* chunk */ this.type, Any]): Chunk
    
    /**
      * Renders a template block, such as a default block or an else block.
      */
    def render(body: Any, context: Context): Chunk
    
    /**
      * Sets an error on this chunk and immediately flushes the output.
      */
    def setError(err: Any): Chunk
    
    /**
      * Convenience method to apply filters to a stream.
      */
    def tap(callback: js.Function1[/* value */ Any, Any]): Chunk
    
    /**
      * Removes the head tap function from the list.
      */
    def untap(): Chunk
    
    /**
      * Writes data to this chunk's buffer. 
      */
    def write(data: String): Chunk
  }
  object Chunk {
    
    inline def apply(
      end: String => Chunk,
      map: js.Function1[Chunk, Any] => Chunk,
      render: (Any, Context) => Chunk,
      setError: Any => Chunk,
      tap: js.Function1[/* value */ Any, Any] => Chunk,
      untap: () => Chunk,
      write: String => Chunk
    ): Chunk = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction1(end), map = js.Any.fromFunction1(map), render = js.Any.fromFunction2(render), setError = js.Any.fromFunction1(setError), tap = js.Any.fromFunction1(tap), untap = js.Any.fromFunction0(untap), write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: String => Chunk): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
      
      inline def setMap(value: js.Function1[Chunk, Any] => Chunk): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setRender(value: (Any, Context) => Chunk): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setSetError(value: Any => Chunk): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
      
      inline def setTap(value: js.Function1[/* value */ Any, Any] => Chunk): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      inline def setUntap(value: () => Chunk): Self = StObject.set(x, "untap", js.Any.fromFunction0(value))
      
      inline def setWrite(value: String => Chunk): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    /**
      * Returns the head of the context stack.
      */
    def current(): Any = js.native
    
    /**
      * Retrieves the value at key from the context stack.
      */
    def get(key: String): Any = js.native
    
    /**
      * Pushes an arbitrary value onto the context stack and returns a new context instance. Specify index and/or length to enable enumeration helpers.
      */
    def push(head: Any): Context = js.native
    def push(head: Any, idx: Double): Context = js.native
    def push(head: Any, idx: Double, len: Double): Context = js.native
    def push(head: Any, idx: Unit, len: Double): Context = js.native
    
    /**
      * Returns a new context instance consisting only of the value at head, plus any previously defined global object.
      */
    def rebase(head: Any): Context = js.native
  }
  
  trait Stream_ extends StObject {
    
    def emit(evt: String, data: Any): Unit
    
    def flush(): Unit
    
    /*
      * Registers an event listener. Streams accept a single listener for a given event.
      * @param evt the event. Possible values are data, end, error (maybe more, look in the source).
      */
    def on(evt: String, callback: js.Function1[/* data */ js.UndefOr[Any], Any]): this.type
    
    def pipe(stream: Stream_): Stream_
  }
  object Stream_ {
    
    inline def apply(
      emit: (String, Any) => Unit,
      flush: () => Unit,
      on: (String, js.Function1[/* data */ js.UndefOr[Any], Any]) => Stream_,
      pipe: Stream_ => Stream_
    ): Stream_ = {
      val __obj = js.Dynamic.literal(emit = js.Any.fromFunction2(emit), flush = js.Any.fromFunction0(flush), on = js.Any.fromFunction2(on), pipe = js.Any.fromFunction1(pipe))
      __obj.asInstanceOf[Stream_]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stream_] (val x: Self) extends AnyVal {
      
      inline def setEmit(value: (String, Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setFlush(value: () => Unit): Self = StObject.set(x, "flush", js.Any.fromFunction0(value))
      
      inline def setOn(value: (String, js.Function1[/* data */ js.UndefOr[Any], Any]) => Stream_): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setPipe(value: Stream_ => Stream_): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    }
  }
  
  type Template = js.Function2[/* chk */ Chunk, /* ctx */ Context, Chunk]
}
