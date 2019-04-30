
# Scala.js typings for exit-hook

Typings are for version 2.2.0

## Library description:
Run some code when the process exits

|                    |                 |
| ------------------ | :-------------: |
| Full name          | exit-hook |
| Keywords           | exit, quit, process, hook, graceful, handler, shutdown, sigterm, sigint, terminate, kill, stop, event, signal |
| # releases         | 4 |
| # dependents       | 88 |
| # downloads        | 102158764 |
| # stars            | 3 |

## Links
- [Homepage](https://github.com/sindresorhus/exit-hook#readme)
- [Bugs](https://github.com/sindresorhus/exit-hook/issues)
- [Repository](https://github.com/sindresorhus/exit-hook)
- [Npm](https://www.npmjs.com/package/exit-hook)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Run some code when the process exits.

The `process.on('exit')` event doesn't catch all the ways a process can exit.

This package is useful for cleaning up before exiting.

@param callback - The callback to execute when the process exits.
@returns A function that removes the hook when called.

@example
```
import exitHook = require('exit-hook');

exitHook(() => {
	console.log('Exiting');
});

// You can add multiple hooks, even across files
exitHook(() => {
	console.log('Exiting 2');
});

throw new Error('🦄');

//=> 'Exiting'
//=> 'Exiting 2'

// Removing an exit hook:
const unsubscribe = exitHook(() => {});

unsubscribe();
```
*/

```

