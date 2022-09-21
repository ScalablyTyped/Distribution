package typings.fileManager

import typings.fileManager.fileManagerStrings.read
import typings.fileManager.fileManagerStrings.save
import typings.node.bufferMod.global.Buffer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("file-manager", JSImport.Namespace)
  @js.native
  /**
    * Initialize a new FileManager instance
    * @param [storageDirectory] - Directory where files will be stored. No trailing slash. No nesting. Use `null` to disable local disk storage.
    */
  open class ^ () extends FileManager {
    def this(storageDirectory: String) = this()
  }
  
  trait Events extends StObject {
    
    var read: js.Tuple2[
        /* filename */ String, 
        /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
      ]
    
    var save: js.Tuple3[
        /* filename */ String, 
        /* contents */ Buffer, 
        /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
      ]
  }
  object Events {
    
    inline def apply(
      read: js.Tuple2[
          /* filename */ String, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
        ],
      save: js.Tuple3[
          /* filename */ String, 
          /* contents */ Buffer, 
          /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
        ]
    ): Events = {
      val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], save = save.asInstanceOf[js.Any])
      __obj.asInstanceOf[Events]
    }
    
    extension [Self <: Events](x: Self) {
      
      inline def setRead(
        value: js.Tuple2[
              /* filename */ String, 
              /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
            ]
      ): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setSave(
        value: js.Tuple3[
              /* filename */ String, 
              /* contents */ Buffer, 
              /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
            ]
      ): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileManager
    extends typings.node.eventsMod.^ {
    
    /**
      * The local disk storage directory location can be changed at any time by assigning to this property.
      */
    var directory: String = js.native
    
    /**
      * Returns `true` if either a storage directory is set, or if save and read handlers have been registered.
      */
    def isEnabled(): Boolean = js.native
    
    @JSName("off")
    def off_read(
      event: read,
      listener: js.Function1[
          /* args */ js.Tuple2[
            /* filename */ String, 
            /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("off")
    def off_save(
      event: save,
      listener: js.Function1[
          /* args */ js.Tuple3[
            /* filename */ String, 
            /* contents */ Buffer, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("on")
    def on_read(
      event: read,
      listener: js.Function1[
          /* args */ js.Tuple2[
            /* filename */ String, 
            /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("on")
    def on_save(
      event: save,
      listener: js.Function1[
          /* args */ js.Tuple3[
            /* filename */ String, 
            /* contents */ Buffer, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    
    @JSName("once")
    def once_read(
      event: read,
      listener: js.Function1[
          /* args */ js.Tuple2[
            /* filename */ String, 
            /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("once")
    def once_save(
      event: save,
      listener: js.Function1[
          /* args */ js.Tuple3[
            /* filename */ String, 
            /* contents */ Buffer, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    
    /**
      * Reads a single file. Returns a `Promise` that fulfills to its content, as a `Buffer`. Rejects if there's an error or the file doesn't exist.
      * @param filename
      */
    def readFile(filename: String): js.Promise[Buffer] = js.native
    
    /**
      * Reads multiple files.
      * @param filenames - Array of filenames
      */
    def readFiles(filenames: js.Array[String]): js.Promise[js.Array[ReadFilesResult]] = js.native
    
    def removeAllListeners(): this.type = js.native
    def removeAllListeners(event: read | save): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_read(
      event: read,
      listener: js.Function1[
          /* args */ js.Tuple2[
            /* filename */ String, 
            /* callback */ js.Function2[/* error */ js.Error | Null, /* contents */ js.UndefOr[Buffer], Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    @JSName("removeListener")
    def removeListener_save(
      event: save,
      listener: js.Function1[
          /* args */ js.Tuple3[
            /* filename */ String, 
            /* contents */ Buffer, 
            /* callback */ js.Function1[/* error */ js.Error | Null, Unit]
          ], 
          Unit
        ]
    ): this.type = js.native
    
    def saveFile(filename: String, contents: WithToString): js.Promise[Unit] = js.native
    /**
      * Saves a file. Returns a `Promise` that will be fulfilled once the file is saved, or rejected if there's an error.
      * @param filename
      * @param contents - Either a `Buffer`, or some other value that will have `.toString()` called on it, then it will be converted to a `Buffer` by interpreting the string as UTF-8
      */
    def saveFile(filename: String, contents: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Saves multiple files. Returns a `Promise` that will be fulfilled once all files are saved, or rejected if there's an error saving any file
      * @param files - An object where keys are filenames and values are file contents
      */
    def saveFiles(files: Record[String, Buffer | WithToString]): js.Promise[Unit] = js.native
    
    def writeFile(filename: String, contents: WithToString): js.Promise[Unit] = js.native
    /**
      * Saves a file. Returns a `Promise` that will be fulfilled once the file is saved, or rejected if there's an error.
      * @param filename
      * @param contents - Either a `Buffer`, or some other value that will have `.toString()` called on it, then it will be converted to a `Buffer` by interpreting the string as UTF-8
      */
    def writeFile(filename: String, contents: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Saves multiple files. Returns a `Promise` that will be fulfilled once all files are saved, or rejected if there's an error saving any file
      * @param files - An object where keys are filenames and values are file contents
      */
    def writeFiles(files: Record[String, Buffer | WithToString]): js.Promise[Unit] = js.native
  }
  
  trait ReadFilesResult extends StObject {
    
    var contents: js.UndefOr[Buffer] = js.undefined
    
    var error: js.UndefOr[js.Error] = js.undefined
    
    var filename: String
  }
  object ReadFilesResult {
    
    inline def apply(filename: String): ReadFilesResult = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadFilesResult]
    }
    
    extension [Self <: ReadFilesResult](x: Self) {
      
      inline def setContents(value: Buffer): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithToString extends StObject
}
